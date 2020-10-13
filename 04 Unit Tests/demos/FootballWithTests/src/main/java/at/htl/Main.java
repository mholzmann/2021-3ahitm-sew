package at.htl;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        SeasonCsvFile csvFile = new SeasonCsvFile("./data/bundesliga-1819.csv");
        Season season = csvFile.read();
        printFootballTable(season);
    }

    private static void printFootballTable(Season season) {
        System.out.printf("%n%-20s %3s %3s %3s %3s %3s %3s %3s %n", "Team", "Pts", "W", "D", "L", "GS", "GR", "GD");
        for (Team team : season.getTeamsSortedByRank()) {
            System.out.printf("%-20s %3d %3d %3d %3d %3d %3d %3d %n", team.getName(), team.getPoints(), team.getWins(), team.getDraws(), team.getDefeats(), team.getGoalsShot(), team.getGoalsReceived(), team.getGoalDifference());
        }
        System.out.println();
        System.out.println("Pts...Points, W...Won, D...Drawn, L...Lost");
        System.out.println("GS...Goals shot, GR...Goals received, GD...Goal difference");
        System.out.println();
    }
}
