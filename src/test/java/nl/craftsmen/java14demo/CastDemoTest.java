package nl.craftsmen.java14demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CastDemoTest {

    @Test
    public void test_casts() {
        Object obj = "hello!";
        if (obj instanceof String s) {
            assertThat(s.toUpperCase()).isEqualTo("HELLO!");
        }
    }
}
