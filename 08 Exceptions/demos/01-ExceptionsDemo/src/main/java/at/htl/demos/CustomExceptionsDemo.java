package at.htl.demos;

import at.htl.exceptions.InvalidFileNameException;
import at.htl.exceptions.InvalidLineIndexException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.NoSuchElementException;

public class CustomExceptionsDemo {
    public static void main(String[] args) throws InvalidFileNameException {
        // Throws (checked) InvalidFileNameException (instead of NoSuchFileException)
        printLine("not-existing.txt", 1);

        // Throws (checked) InvalidFileNameException (instead of InvalidPathException)
        printLine("???.txt", 1);

        // Throws (unchecked) InvalidArgumentException (instead of NoSuchElementException)
        printLine("alphabet.txt", 20);
    }

    private static void printLine(String filename, int lineIndex) throws InvalidFileNameException {
        System.out.println("--------------------------------------------");
        try {
            String line = Files.lines(Path.of(filename))
                    .skip(lineIndex)
                    .findFirst()
                    .orElseThrow();
            System.out.println(line);
        } catch (NoSuchFileException | InvalidPathException e) { // Union catch clause
            throw new InvalidFileNameException(filename, e);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchElementException e) {
            throw new InvalidLineIndexException();
        }
    }
}
