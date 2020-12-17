package at.htl.demos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.NoSuchElementException;

public class TryCatchDemo {
    public static void main(String[] args) {

        // Throws no exception because NoSuchFileException is handled by first catch clause
        // Second catch clause would also handle it, but each exception is just handled once
        printLine("not-existing.txt", 1);

        // Executed because exception was handled
        printLine("alphabet.txt", 1);

        // Throws no exception because InvalidPathException is handled by first catch clause
        // Second catch clause would not handle it (InvalidPathException is no IOException)
        printLine("???.txt", 1);

        // Executed because all exceptions were handled
        // Throws unhandled IndexOutOfBoundsException (instead of handled NoSuchElementException)
        printLine("alphabet.txt", 20);
    }

    private static void printLine(String filename, int lineIndex) {
        System.out.println("--------------------------------------------");
        try {
            String line = Files.lines(Path.of(filename))
                    .skip(lineIndex)
                    .findFirst()
                    .orElseThrow();
            System.out.println(line);
        } catch (NoSuchFileException | InvalidPathException e) {    // union catch
            System.out.println("Invalid filename");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchElementException e) {
            throw new IndexOutOfBoundsException("Invalid lineIndex");
        }
    }
}
