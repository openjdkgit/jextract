/*
 * Copyright (c) 2022 Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package org.openjdk.jextract.impl;

import org.openjdk.jextract.Declaration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * This visitor filters tree elements based on --include options specified.
 */
final class IncludeFilter implements TreeTransformer, Declaration.Visitor<Void, Declaration> {
    private List<Declaration> decls = new ArrayList<>();
    private final IncludeHelper includeHelper;

    IncludeFilter(IncludeHelper includeHelper) {
        this.includeHelper = includeHelper;
    }

    @Override
    public Declaration.Scoped transform(Declaration.Scoped header) {
        // Process all header declarations are collect potential
        // declarations that will go into transformed HeaderTree
        // into the this.decls field.
        header.members().forEach(fieldTree -> fieldTree.accept(this, null));
        return createHeader(header, decls);
    }

    @Override
    public Void visitConstant(Declaration.Constant constant, Declaration parent) {
        if (!includeHelper.isIncluded(constant)) {
            //skip
            return null;
        }
        decls.add(constant);
        return null;
    }

    @Override
    public Void visitFunction(Declaration.Function funcTree, Declaration parent) {
        if (!includeHelper.isIncluded(funcTree)) {
            return null;
        }

        decls.add(funcTree);
        return null;
    }

    @Override
    public Void visitScoped(Declaration.Scoped d, Declaration parent) {
        boolean isStructKind = switch (d.kind()) {
            case STRUCT, UNION -> true;
            default -> false;
        };
        if (isStructKind) {
            String name = d.name();
            if (!name.isEmpty() && !includeHelper.isIncluded(d)) {
                return null;
            }
        }

        List<Declaration> oldDecls = decls;
        this.decls = new ArrayList<>();
        try {
            d.members().forEach(fieldTree -> fieldTree.accept(this, d));
        } finally {
            var scoped = createScoped(d, decls);
            this.decls = oldDecls;
            decls.add(scoped);
        }
        return null;
    }

    @Override
    public Void visitTypedef(Declaration.Typedef tree, Declaration parent) {
        if (!includeHelper.isIncluded(tree)) {
            return null;
        }
        decls.add(tree);
        return null;
    }

    @Override
    public Void visitVariable(Declaration.Variable tree, Declaration parent) {
        if (parent == null && !includeHelper.isIncluded(tree)) {
            return null;
        }
        decls.add(tree);
        return null;
    }

    @Override
    public Void visitDeclaration(Declaration decl, Declaration parent) {
        decls.add(decl);
        return null;
    }
}
