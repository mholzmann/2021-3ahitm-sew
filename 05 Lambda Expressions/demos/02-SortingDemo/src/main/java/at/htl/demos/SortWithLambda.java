package at.htl.demos;

import at.htl.model.Player;

import at.htl.model.*;
import java.util.Arrays;

public class SortWithLambda {

    public static void main(String[] args) {
        Player[] players = {
                new Player("Susan", 67, Gender.FEMALE),
                new Player("John", 59, Gender.MALE),
                new Player("Jane", 45, Gender.FEMALE),
                new Player("Roger", 21, Gender.MALE)
        };

        Arrays.sort(players, (p1, p2) -> Integer.compare(p1.getRanking(), p2.getRanking()));
        System.out.println(Arrays.toString(players));
    }
}
