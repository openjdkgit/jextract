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
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1 {

    static final FunctionDescriptor clang_equalLocations$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(2, Constants$root.C_POINTER$LAYOUT).withName("ptr_data"),
            Constants$root.C_INT$LAYOUT.withName("int_data"),
            MemoryLayout.paddingLayout(32)
        ),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(2, Constants$root.C_POINTER$LAYOUT).withName("ptr_data"),
            Constants$root.C_INT$LAYOUT.withName("int_data"),
            MemoryLayout.paddingLayout(32)
        )
    );
    static final MethodHandle clang_equalLocations$MH = RuntimeHelper.downcallHandle(
        "clang_equalLocations",
        constants$1.clang_equalLocations$FUNC
    );
    static final FunctionDescriptor clang_getLocation$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(2, Constants$root.C_POINTER$LAYOUT).withName("ptr_data"),
        Constants$root.C_INT$LAYOUT.withName("int_data"),
        MemoryLayout.paddingLayout(32)
    ),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle clang_getLocation$MH = RuntimeHelper.downcallHandle(
        "clang_getLocation",
        constants$1.clang_getLocation$FUNC
    );
    static final FunctionDescriptor clang_getLocationForOffset$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(2, Constants$root.C_POINTER$LAYOUT).withName("ptr_data"),
        Constants$root.C_INT$LAYOUT.withName("int_data"),
        MemoryLayout.paddingLayout(32)
    ),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle clang_getLocationForOffset$MH = RuntimeHelper.downcallHandle(
        "clang_getLocationForOffset",
        constants$1.clang_getLocationForOffset$FUNC
    );
    static final FunctionDescriptor clang_Location_isInSystemHeader$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(2, Constants$root.C_POINTER$LAYOUT).withName("ptr_data"),
            Constants$root.C_INT$LAYOUT.withName("int_data"),
            MemoryLayout.paddingLayout(32)
        )
    );
    static final MethodHandle clang_Location_isInSystemHeader$MH = RuntimeHelper.downcallHandle(
        "clang_Location_isInSystemHeader",
        constants$1.clang_Location_isInSystemHeader$FUNC
    );
    static final FunctionDescriptor clang_Location_isFromMainFile$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(2, Constants$root.C_POINTER$LAYOUT).withName("ptr_data"),
            Constants$root.C_INT$LAYOUT.withName("int_data"),
            MemoryLayout.paddingLayout(32)
        )
    );
    static final MethodHandle clang_Location_isFromMainFile$MH = RuntimeHelper.downcallHandle(
        "clang_Location_isFromMainFile",
        constants$1.clang_Location_isFromMainFile$FUNC
    );
    static final FunctionDescriptor clang_Range_isNull$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(2, Constants$root.C_POINTER$LAYOUT).withName("ptr_data"),
            Constants$root.C_INT$LAYOUT.withName("begin_int_data"),
            Constants$root.C_INT$LAYOUT.withName("end_int_data")
        )
    );
    static final MethodHandle clang_Range_isNull$MH = RuntimeHelper.downcallHandle(
        "clang_Range_isNull",
        constants$1.clang_Range_isNull$FUNC
    );
}


