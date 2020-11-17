package at.htl.demos;

import at.htl.model.Gender;
import at.htl.model.Player;

import java.util.Arrays;
import java.util.Comparator;

public class SortByMultipleFields {

    public static void main(String[] args) {
        Player[] players = {
                new Player("Susan", 67, Gender.FEMALE),
                new Player("John", 59, Gender.MALE),
                new Player("Jane", 45, Gender.FEMALE),
                new Player("Roger", 21, Gender.MALE)
        };

        /*
        Arrays.sort(players, (p1, p2) -> {
            if (p1.getGender() != p2.getGender()) {
                return p1.getGender().compareTo(p2.getGender());
            } else {
                return p1.getName().compareTo(p2.getName());
            }
        });
        */

        Arrays.sort(players, Comparator.comparing(Player::getGender).thenComparing(Player::getName));
        System.out.println(Arrays.toString(players));
    }
}
