/*
 *  Copyright (c) 2022, Oracle and/or its affiliates. All rights reserved.
 *  DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 *  This code is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License version 2 only, as
 *  published by the Free Software Foundation.  Oracle designates this
 *  particular file as subject to the "Classpath" exception as provided
 *  by Oracle in the LICENSE file that accompanied this code.
 *
 *  This code is distributed in the hope that it will be useful, but WITHOUT
 *  ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 *  FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 *  version 2 for more details (a copy is included in the LICENSE file that
 *  accompanied this code).
 *
 *  You should have received a copy of the GNU General Public License version
 *  2 along with this work; if not, write to the Free Software Foundation,
 *  Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 *   Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 *  or visit www.oracle.com if you need additional information or have any
 *  questions.
 */

// Generated by jextract

package org.openjdk.jextract.clang.libclang;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$15 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$15() {}
    static final FunctionDescriptor clang_getCursorDisplayName$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("data"),
        Constants$root.C_INT$LAYOUT.withName("private_flags"),
        MemoryLayout.paddingLayout(32)
    ),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("kind"),
            Constants$root.C_INT$LAYOUT.withName("xdata"),
            MemoryLayout.sequenceLayout(3, Constants$root.C_POINTER$LAYOUT).withName("data")
        )
    );
    static final MethodHandle clang_getCursorDisplayName$MH = RuntimeHelper.downcallHandle(
        "clang_getCursorDisplayName",
        constants$15.clang_getCursorDisplayName$FUNC
    );
    static final FunctionDescriptor clang_getCursorReferenced$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("kind"),
        Constants$root.C_INT$LAYOUT.withName("xdata"),
        MemoryLayout.sequenceLayout(3, Constants$root.C_POINTER$LAYOUT).withName("data")
    ),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("kind"),
            Constants$root.C_INT$LAYOUT.withName("xdata"),
            MemoryLayout.sequenceLayout(3, Constants$root.C_POINTER$LAYOUT).withName("data")
        )
    );
    static final MethodHandle clang_getCursorReferenced$MH = RuntimeHelper.downcallHandle(
        "clang_getCursorReferenced",
        constants$15.clang_getCursorReferenced$FUNC
    );
    static final FunctionDescriptor clang_getCursorDefinition$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("kind"),
        Constants$root.C_INT$LAYOUT.withName("xdata"),
        MemoryLayout.sequenceLayout(3, Constants$root.C_POINTER$LAYOUT).withName("data")
    ),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("kind"),
            Constants$root.C_INT$LAYOUT.withName("xdata"),
            MemoryLayout.sequenceLayout(3, Constants$root.C_POINTER$LAYOUT).withName("data")
        )
    );
    static final MethodHandle clang_getCursorDefinition$MH = RuntimeHelper.downcallHandle(
        "clang_getCursorDefinition",
        constants$15.clang_getCursorDefinition$FUNC
    );
    static final FunctionDescriptor clang_isCursorDefinition$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("kind"),
            Constants$root.C_INT$LAYOUT.withName("xdata"),
            MemoryLayout.sequenceLayout(3, Constants$root.C_POINTER$LAYOUT).withName("data")
        )
    );
    static final MethodHandle clang_isCursorDefinition$MH = RuntimeHelper.downcallHandle(
        "clang_isCursorDefinition",
        constants$15.clang_isCursorDefinition$FUNC
    );
    static final FunctionDescriptor clang_Cursor_isVariadic$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("kind"),
            Constants$root.C_INT$LAYOUT.withName("xdata"),
            MemoryLayout.sequenceLayout(3, Constants$root.C_POINTER$LAYOUT).withName("data")
        )
    );
    static final MethodHandle clang_Cursor_isVariadic$MH = RuntimeHelper.downcallHandle(
        "clang_Cursor_isVariadic",
        constants$15.clang_Cursor_isVariadic$FUNC
    );
    static final FunctionDescriptor clang_Cursor_getMangling$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("data"),
        Constants$root.C_INT$LAYOUT.withName("private_flags"),
        MemoryLayout.paddingLayout(32)
    ),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("kind"),
            Constants$root.C_INT$LAYOUT.withName("xdata"),
            MemoryLayout.sequenceLayout(3, Constants$root.C_POINTER$LAYOUT).withName("data")
        )
    );
    static final MethodHandle clang_Cursor_getMangling$MH = RuntimeHelper.downcallHandle(
        "clang_Cursor_getMangling",
        constants$15.clang_Cursor_getMangling$FUNC
    );
}


