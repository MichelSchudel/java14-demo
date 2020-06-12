package nl.craftsmen.java14demo;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SwitchExpressionDemo {

    @Test
    public void switchExpressions() {
        assertThat(switchExpression("hi")).isEqualTo("hiResponse");
        assertThat(switchExpression("hiStart")).isEqualTo("startsWithH");
        assertThat(switchExpression("noStart")).isEqualTo("doesNotStartWitH");
    }

    private String switchExpression(String input) {
        String result = switch (input) {
            case "hi" -> "hiResponse";
            default -> {
                if (input.startsWith("h")) {
                    yield "startsWithH";
                } else {
                    yield "doesNotStartWitH";
                }
            }
        };
        return result;

    }
}