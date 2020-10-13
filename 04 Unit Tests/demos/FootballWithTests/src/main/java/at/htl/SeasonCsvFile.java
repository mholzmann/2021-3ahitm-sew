package at.htl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SeasonCsvFile {
    Path path;

    public SeasonCsvFile(String path) {
        this.path = Path.of(path);
    }

    public Season read() throws IOException {
        Season season = new Season();
        List<String> lines = Files.readAllLines(path);
        lines.remove(0);
        for (String line : lines) {
            season.addMatch(parseMatch(line));
        }
        return season;
    }

    private Match parseMatch(String csvLine) {
        String[] matchData = csvLine.split(";");
        String homeName = matchData[1];
        String guestName = matchData[2];
        int homeGoals = Integer.parseInt(matchData[3]);
        int guestGoals = Integer.parseInt(matchData[4]);
        return new Match(homeName, guestName, homeGoals, guestGoals);
    }
}
