// Generated by jextract

package org.openjdk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * long long (*JImageGetResource_t)(struct JImageFile* jimage,long long location,char* buffer,long long size);
 * }
 */
public interface JImageGetResource_t {

    long apply(java.lang.foreign.MemorySegment jimage, long location, java.lang.foreign.MemorySegment buffer, long size);
    static MemorySegment allocate(JImageGetResource_t fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(JImageGetResource_t.class, fi, constants$2.JImageGetResource_t$FUNC, scope);
    }
    static JImageGetResource_t ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _jimage, long _location, java.lang.foreign.MemorySegment _buffer, long _size) -> {
            try {
                return (long)constants$2.JImageGetResource_t$MH.invokeExact(symbol, _jimage, _location, _buffer, _size);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


