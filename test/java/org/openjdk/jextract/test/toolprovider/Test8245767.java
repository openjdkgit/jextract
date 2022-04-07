/*
 * Copyright (c) 2020, Oracle and/or its affiliates. All rights reserved.
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

package org.openjdk.jextract.test.toolprovider;

import java.lang.reflect.Method;
import java.nio.file.Path;

import org.openjdk.jextract.test.TestUtils;
import org.testng.annotations.Test;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

/*
 * @test
 * @library /lib
 * @build JextractToolRunner
 * @bug 8245767
 * @summary jextract crashes with typedef on a opaque struct or union
 * @run testng/othervm --enable-native-access=ALL-UNNAMED Test8245767
 */
public class Test8245767 extends JextractToolRunner {
    @Test
    public void testTypedefs() {
        Path test8245767Output = getOutputFilePath("test8245767_gen");
        Path test8245767H = getInputFilePath("test8245767.h");
        run("-d", test8245767Output.toString(), test8245767H.toString()).checkSuccess();
        try(TestUtils.Loader loader = TestUtils.classLoader(test8245767Output)) {
            Class<?> cls = loader.loadClass("test8245767_h");
            assertNotNull(cls);

            // class should be generated for typedef on opaque struct
            Class<?> fooCls = loader.loadClass("Foo");
            assertNotNull(fooCls);

            // check Point_t
            Class<?> point_tCls = loader.loadClass("Point_t");
            assertNotNull(point_tCls);

            // check Point
            Class<?> pointCls = loader.loadClass("Point");
            assertNotNull(pointCls);
            assertTrue(pointCls.isAssignableFrom(point_tCls));
        } finally {
            TestUtils.deleteDir(test8245767Output);
        }
    }
}
