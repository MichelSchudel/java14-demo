package nl.craftsmen.java14demo;


import org.junit.jupiter.api.Test;

public class TextBlocksDemo {



//    String html = "<html>\n" +
//                  "    <body>\n" +
//                  "        <p class=\"title\">Hello, Craftsmen</p>\n" +
//                  "    </body>\n" +
//                  "</html>\n";



    String html = """
                  <html>
                      <body>
                          <p class="title">Hello, Craftsmen</p>
                      </body>
                  </html>
                  """;

    @Test
    public void textBlocks() {
        System.out.println("----start------");
        System.out.println(html);
        System.out.println("----end--------");
    }

}
