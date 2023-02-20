// Generated by jextract

package org.openjdk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * char* (*JImagePackageToModule_t)(struct JImageFile* jimage,char* package_name);
 * }
 */
public interface JImagePackageToModule_t {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment jimage, java.lang.foreign.MemorySegment package_name);
    static MemorySegment allocate(JImagePackageToModule_t fi, Arena scope) {
        return RuntimeHelper.upcallStub(JImagePackageToModule_t.class, fi, constants$1.JImagePackageToModule_t$FUNC, scope);
    }
    static JImagePackageToModule_t ofAddress(MemorySegment addr, Arena scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _jimage, java.lang.foreign.MemorySegment _package_name) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$1.JImagePackageToModule_t$MH.invokeExact(symbol, _jimage, _package_name);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


