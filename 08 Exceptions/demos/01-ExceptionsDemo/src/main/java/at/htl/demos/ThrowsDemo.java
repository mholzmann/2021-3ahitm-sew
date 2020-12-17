package at.htl.demos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ThrowsDemo {

    public static void main(String[] args) throws IOException {
        // Throws exception
        printLine("not-existing.txt", 1);

        // Not executed because of unhandled exception
        printLine("alphabet.txt", 1);
    }

    private static void printLine(String filename, int lineIndex) throws IOException {
        System.out.println("--------------------------------------------");
        String line = Files.lines(Path.of(filename))
                .skip(lineIndex)
                .findFirst()
                .orElseThrow();
        System.out.println(line);
    }
}
