package at.htl.demos;

import at.htl.model.*;

import java.util.Arrays;
import java.util.Comparator;

public class SortWithComparingFactory {

    public static void main(String[] args) {
        Player[] players = {
                new Player("Susan", 67, Gender.FEMALE),
                new Player("John", 59, Gender.MALE),
                new Player("Jane", 45, Gender.FEMALE),
                new Player("Roger", 21, Gender.MALE)
        };

        Arrays.sort(players, Comparator.comparingInt(Player::getRanking));
        System.out.println(Arrays.toString(players));
    }
}
