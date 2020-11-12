package at.htl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CSVFile<E> {
    private final Path path;
    private final CSVParser<E> csvParser;

    public CSVFile(String path, CSVParser<E> csvParser) {
        this.path = Path.of(path);
        this.csvParser = csvParser;
    }

    public List<E> readEntities() throws IOException {
        List<E> records = new ArrayList<>();
        List<String> lines = Files.readAllLines(path);
        lines.remove(0);
        for (String line : lines) {
            records.add(csvParser.parseEntity(line));
        }
        return records;
    }
}