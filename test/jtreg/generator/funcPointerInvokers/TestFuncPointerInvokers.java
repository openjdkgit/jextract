/*
 * Copyright (c) 2021, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
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

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySegment;
import org.testng.annotations.Test;

import java.util.concurrent.atomic.AtomicInteger;

import static org.testng.Assert.*;

import static test.jextract.funcpointers.func_h.*;
import test.jextract.funcpointers.*;

/*
 * @test id=classes
  * @library /lib
 * @run main/othervm JtregJextract -l Func -t test.jextract.funcpointers func.h
 * @run testng/othervm --enable-native-access=ALL-UNNAMED TestFuncPointerInvokers
 */
/*
 * @test id=sources
  * @library /lib
 * @run main/othervm JtregJextract -l Func -t test.jextract.funcpointers func.h
 * @run testng/othervm --enable-native-access=ALL-UNNAMED TestFuncPointerInvokers
 */
public class TestFuncPointerInvokers {
    @Test
    public void testStructFieldTypedef() {
        try (Arena session = Arena.openConfined()) {
            AtomicInteger val = new AtomicInteger(-1);
            MemorySegment bar = Bar.allocate(session);
            Bar.foo$set(bar, Foo.allocate((i) -> val.set(i), session));
            Foo.apply(Bar.foo$get(bar), 42);
            assertEquals(val.get(), 42);
        }
    }

    @Test
    public void testStructFieldFITypedef() {
        try (Arena session = Arena.openConfined()) {
            AtomicInteger val = new AtomicInteger(-1);
            MemorySegment bar = Bar.allocate(session);
            Bar.foo$set(bar, Foo.allocate((i) -> val.set(i), session));
            Foo.apply(Bar.foo$get(bar), 42);
            assertEquals(val.get(), 42);
        }
    }

    @Test
    public void testGlobalTypedef() {
        try (Arena session = Arena.openConfined()) {
            AtomicInteger val = new AtomicInteger(-1);
            f$set(Foo.allocate((i) -> val.set(i), session));
            Foo.apply(f$get(), 42);
            assertEquals(val.get(), 42);
        }
    }

    @Test
    public void testGlobalFITypedef() {
        try (Arena session = Arena.openConfined()) {
            AtomicInteger val = new AtomicInteger(-1);
            f$set(Foo.allocate((i) -> val.set(i), session));
            Foo.apply(f$get(), 42);
            assertEquals(val.get(), 42);
        }
    }

    @Test
    public void testStructFieldFunctionPointer() {
        try (Arena session = Arena.openConfined()) {
            AtomicInteger val = new AtomicInteger(-1);
            MemorySegment baz = Baz.allocate(session);
            Baz.fp$set(baz, Baz.fp.allocate((i) -> val.set(i), session));
            Baz.fp.apply(Baz.fp$get(baz), 42);
            assertEquals(val.get(), 42);
        }
    }

    @Test
    public void testStructFieldFIFunctionPointer() {
        try (Arena session = Arena.openConfined()) {
            AtomicInteger val = new AtomicInteger(-1);
            MemorySegment baz = Baz.allocate(session);
            Baz.fp$set(baz, Baz.fp.allocate((i) -> val.set(i), session));
            Baz.fp.apply(Baz.fp$get(baz), 42);
            assertEquals(val.get(), 42);
        }
    }

    @Test
    public void testGlobalFunctionPointer() {
        try (Arena session = Arena.openConfined()) {
            AtomicInteger val = new AtomicInteger(-1);
            fp$set(fp.allocate((i) -> val.set(i), session));
            fp.apply(fp$get(), 42);
            assertEquals(val.get(), 42);
        }
    }

    @Test
    public void testGlobalFIFunctionPointer() {
        try (Arena session = Arena.openConfined()) {
            AtomicInteger val = new AtomicInteger(-1);
            fp$set(fp.allocate((i) -> val.set(i), session));
            fp.apply(fp$get(), 42);
            assertEquals(val.get(), 42);
        }
    }

    @Test
    public void testGlobalFIFunctionPointerAddress() {
        try (Arena session = Arena.openConfined()) {
            fp_addr$set(fp_addr.allocate((addr) -> MemorySegment.ofAddress(addr.address() + 1), session));
            assertEquals(fp_addr.apply(fp_addr$get(), MemorySegment.ofAddress(42)).address(), MemorySegment.ofAddress(43).address());
        }
    }
}
