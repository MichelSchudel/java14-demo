package nl.craftsmen.java14demo;

import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryHandles;
import jdk.incubator.foreign.MemorySegment;
import org.junit.jupiter.api.Test;

import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;

public class MemoryApiTest {


    @Test
    public void testMemory() {
        VarHandle intHandle = MemoryHandles.varHandle(int.class,
                ByteOrder.nativeOrder());
        try (MemorySegment segment = MemorySegment.allocateNative(100)) {
            MemoryAddress base = segment.baseAddress();
            for (int i = 0; i < 25; i++) {
                intHandle.set(base.addOffset(i * 4), i);
            }
            System.out.println(segment.asByteBuffer().toString());
        }
    }


}
