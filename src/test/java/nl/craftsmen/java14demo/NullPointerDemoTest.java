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
    public void when_nullpointer_then_show_detail_message() {
        Pointer pointer = new Pointer(null);
        try {
            pointer.pointer.pointer = pointer;
        } catch (NullPointerException e) {
            assertThat(e.getMessage()).isEqualTo("""
                    Cannot assign field "pointer" because "pointer.pointer" is null""");
            System.out.println(e.getMessage());
        }
    }
}
