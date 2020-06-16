package nl.craftsmen.java14demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Add:
 * --enable-preview
 * -XX:+ShowCodeDetailsInExceptionMessages
 *
 * to your IDE's test config first before running this test
 */
public class NullPointerDemoTest {

    private class Pointer {
        Pointer pointer;

        public Pointer(Pointer pointer) {
            this.pointer = pointer;
        }
    }

    @Test
    public void when_nullspointer_then_show_detail_message() {
        Pointer pointer = new Pointer(null);
        System.out.println(pointer.pointer.pointer);
    }
}
