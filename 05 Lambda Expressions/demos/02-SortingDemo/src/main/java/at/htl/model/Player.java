package at.htl.model;

public class Player implements Comparable<Player>{
    private final String name;
    private final int ranking;
    private final Gender gender;

    public Player(String name, int ranking, Gender gender) {
        this.name = name;
        this.ranking = ranking;
        this.gender = gender;
    }

    @Override
    public int compareTo(Player other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public int getRanking() {
        return ranking;
    }

    public Gender getGender() {
        return gender;
    }
}
