package at.htl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WriteFileDemo {

    public static void main(String[] args) throws IOException {
        writeFileFromString("hello.txt", "Hello World!\nHello Java!");

        List<String> lines = List.of("milk", "bread", "sugar");
        writeFileFromList("shopping.txt", lines);
    }

    private static void writeFileFromString(String fileName, String content) throws IOException {
        Path path = Path.of(fileName);
        Files.write(path, content.getBytes());
    }

    private static void writeFileFromList(String fileName, List<String> lines) throws IOException {
        Path path = Path.of(fileName);
        Files.write(path, lines);
    }
}
