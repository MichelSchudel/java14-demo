package nl.craftsmen.java14demo;


import org.junit.jupiter.api.Test;

public class TextBlocksDemo {

    String html = """
                <html>
                <body>
                    <p>Hello, Craftsmen</p>
                </body>
            </html>\"""
                        """;

    @Test
    public void textBlocks() {
        System.out.println(html);
    }

}
