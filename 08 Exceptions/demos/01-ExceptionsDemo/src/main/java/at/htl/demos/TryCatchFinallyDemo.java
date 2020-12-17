package at.htl.demos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        printLine("alphabet.txt", 1);
    }

    private static void printLine(String filename, int lineIndex) {
        Stream<String> stream = null;
        try {
            stream = Files.lines(Path.of(filename));
            String line = stream
                    .skip(lineIndex)
                    .findFirst()
                    .orElseThrow();
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Code in finally-block is always executed (even if an handled or unhandled exception would be thrown in try-block)
            // Close the stream to ensure that the stream's open file is closed promptly after the stream's operations have completed
            if (stream != null) {
                stream.close();
            }
        }
    }
}
