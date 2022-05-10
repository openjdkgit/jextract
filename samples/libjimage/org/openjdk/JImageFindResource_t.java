// Generated by jextract

package org.openjdk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface JImageFindResource_t {

    long apply(java.lang.foreign.MemoryAddress jimage, java.lang.foreign.MemoryAddress module_name, java.lang.foreign.MemoryAddress version, java.lang.foreign.MemoryAddress name, java.lang.foreign.MemoryAddress size);
    static MemorySegment allocate(JImageFindResource_t fi, MemorySession scope) {
        return RuntimeHelper.upcallStub(JImageFindResource_t.class, fi, constants$1.JImageFindResource_t$FUNC, "(Ljava/lang/foreign/MemoryAddress;Ljava/lang/foreign/MemoryAddress;Ljava/lang/foreign/MemoryAddress;Ljava/lang/foreign/MemoryAddress;Ljava/lang/foreign/MemoryAddress;)J", scope);
    }
    static JImageFindResource_t ofAddress(MemoryAddress addr, MemorySession scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, scope);
        return (java.lang.foreign.MemoryAddress _jimage, java.lang.foreign.MemoryAddress _module_name, java.lang.foreign.MemoryAddress _version, java.lang.foreign.MemoryAddress _name, java.lang.foreign.MemoryAddress _size) -> {
            try {
                return (long)constants$1.JImageFindResource_t$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_jimage, (java.lang.foreign.Addressable)_module_name, (java.lang.foreign.Addressable)_version, (java.lang.foreign.Addressable)_name, (java.lang.foreign.Addressable)_size);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


