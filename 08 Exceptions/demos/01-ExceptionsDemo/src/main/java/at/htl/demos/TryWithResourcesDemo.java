package at.htl.demos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class TryWithResourcesDemo {
    public static void main(String[] args) {
        printLine("alphabet.txt", 1);
    }

    private static void printLine(String filename, int lineIndex) {
        // try-with-resources closes the stream automatically (works because Stream implements AutoCloseable)
        // That ensures that the stream's open file is closed promptly after the stream's operations have completed
        try (Stream<String> stream = Files.lines(Path.of(filename))) {
            String line = stream
                    .skip(lineIndex)
                    .findFirst()
                    .orElseThrow();
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
