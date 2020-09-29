package at.htl;

import java.nio.file.Files;
import java.nio.file.Path;

public class FileInfoDemo {

    public static void main(String[] args) {
        printFileInfo("members.csv");
        System.out.println("--------------------");
        printFileInfo("src/main/java");
        System.out.println("--------------------");
        printFileInfo("C:\\tmp\\deleted");
    }

    private static void printFileInfo(String fileName) {
        Path path = Path.of(fileName);
        System.out.printf("path.toString() -> %s%n", path);
        System.out.printf("path.getFileName() -> %s%n", path.getFileName());
        System.out.printf("path.getParent() -> %s%n", path.getParent());
        System.out.printf("path.getRoot() -> %s%n", path.getRoot());
        System.out.printf("Files.exists(path) -> %s%n", Files.exists(path));
        System.out.printf("Files.isDirectory(path) -> %s%n", Files.isDirectory(path));
    }
}
