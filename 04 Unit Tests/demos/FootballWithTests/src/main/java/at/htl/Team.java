package at.htl;

import java.util.Objects;

public class Team implements Comparable<Team>{

    private final String name;
    private int points = 0;
    private int wins = 0;
    private int draws = 0;
    private int defeats = 0;
    private int goalsShot = 0;
    private int goalsReceived = 0;

    public Team(String name) {
        this.name = name;
    }

    public void addMatchResult(int points, int goalsShot, int goalsReceived) {
        this.points += points;
        this.goalsShot += goalsShot;
        this.goalsReceived += goalsReceived;
        switch (points) {
            case 3 -> wins++;
            case 1 -> draws++;
            case 0 -> defeats++;
        }
    }

    @Override
    public int compareTo(Team other) {
        if (this.getPoints() != other.getPoints()) {
            return other.getPoints() - this.getPoints();
        } else if (this.getGoalDifference() != other.getGoalDifference()) {
            return Integer.compare(other.getGoalDifference(), this.getGoalDifference());
            // return other.getGoalDifference() - this.getGoalDifference();
        } else if (this.getGoalsShot() != other.getGoalsShot()) {
            return other.getGoalsShot() - this.getGoalsShot();
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return name.equals(team.name);
    }

    @Override
    public String toString() {
        return "Team " + name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public int getWins() {
        return wins;
    }

    public int getDraws() {
        return draws;
    }

    public int getDefeats() {
        return defeats;
    }

    public int getGoalsShot() {
        return goalsShot;
    }

    public int getGoalsReceived() {
        return goalsReceived;
    }

    public int getGoalDifference() {
        return goalsShot - goalsReceived;
    }
}
