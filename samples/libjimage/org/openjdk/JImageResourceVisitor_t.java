// Generated by jextract

package org.openjdk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*JImageResourceVisitor_t)(struct JImageFile* jimage,char* module_name,char* version,char* package,char* name,char* extension,void* arg);
 * }
 */
public interface JImageResourceVisitor_t {

    int apply(java.lang.foreign.MemorySegment jimage, java.lang.foreign.MemorySegment module_name, java.lang.foreign.MemorySegment version, java.lang.foreign.MemorySegment package_, java.lang.foreign.MemorySegment name, java.lang.foreign.MemorySegment extension, java.lang.foreign.MemorySegment arg);
    static MemorySegment allocate(JImageResourceVisitor_t fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$3.const$1, fi, constants$3.const$0, scope);
    }
    static JImageResourceVisitor_t ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _jimage, java.lang.foreign.MemorySegment _module_name, java.lang.foreign.MemorySegment _version, java.lang.foreign.MemorySegment _package_, java.lang.foreign.MemorySegment _name, java.lang.foreign.MemorySegment _extension, java.lang.foreign.MemorySegment _arg) -> {
            try {
                return (int)constants$3.const$2.invokeExact(symbol, _jimage, _module_name, _version, _package_, _name, _extension, _arg);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


