// Generated by jextract

package org.openjdk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * long long (*JImageFindResource_t)(struct JImageFile* jimage,char* module_name,char* version,char* name,long long* size);
 * }
 */
public interface JImageFindResource_t {

    long apply(java.lang.foreign.MemorySegment jimage, java.lang.foreign.MemorySegment module_name, java.lang.foreign.MemorySegment version, java.lang.foreign.MemorySegment name, java.lang.foreign.MemorySegment size);
    static MemorySegment allocate(JImageFindResource_t fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(JImageFindResource_t.class, fi, constants$1.JImageFindResource_t$FUNC, scope);
    }
    static JImageFindResource_t ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _jimage, java.lang.foreign.MemorySegment _module_name, java.lang.foreign.MemorySegment _version, java.lang.foreign.MemorySegment _name, java.lang.foreign.MemorySegment _size) -> {
            try {
                return (long)constants$1.JImageFindResource_t$MH.invokeExact(symbol, _jimage, _module_name, _version, _name, _size);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


