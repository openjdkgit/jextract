/*
 * Copyright (c) 2020, 2024, Oracle and/or its affiliates. All rights reserved.
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

import org.testng.annotations.Test;

import java.lang.foreign.Arena;
import test.jextract.test8261511.*;
import static org.testng.Assert.assertEquals;
import static test.jextract.test8261511.test8261511_h.*;

/*
 * @test
 * @bug 8261511
 * @summary jextract does not generate accessor for MemorySegement typed values
 * @library /lib
 * @build testlib.TestUtils
 * @run main/othervm JtregJextract -l Test8261511 --use-system-load-library -t test.jextract.test8261511 test8261511.h
 * @build Test8261511
 * @run testng/othervm --enable-native-access=ALL-UNNAMED Test8261511
 */
public class Test8261511 {
    @Test
    public void test() {
        try (Arena arena = Arena.ofConfined()) {
            var funcPtr = Foo.sum(get_foo(arena));
            assertEquals(Foo.sum.invoke(funcPtr, 15, 20), 35);
            assertEquals(sum(1.2, 4.5), 5.7, 0.001);
        }
    }
}
