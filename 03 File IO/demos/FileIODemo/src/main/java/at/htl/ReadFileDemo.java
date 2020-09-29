package at.htl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadFileDemo {

    public static void main(String[] args) throws IOException {
        String content = readFileToString("members.csv");
        System.out.println(content);

        System.out.println("------------------------------------");

        List<String> lines = readFileToList("members.csv");
        for (String line : lines) {
            System.out.println(line);
        }
    }

    private static String readFileToString(String fileName) throws IOException {
        Path path = Path.of(fileName);
        byte[] bytes = Files.readAllBytes(path);
        return new String(bytes);
    }

    private static List<String> readFileToList(String fileName) throws IOException {
        Path path = Path.of(fileName);
        return Files.readAllLines(path);
    }
}
