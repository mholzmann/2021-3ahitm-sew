package at.htl.demos;

import at.htl.model.*;
import java.util.Arrays;

public class SortWithComparable {

    public static void main(String[] args) {
        Player[] players = {
                new Player("John", 59, Gender.MALE),
                new Player("Susan", 67, Gender.FEMALE),
                new Player("Jane", 45, Gender.FEMALE),
                new Player("Roger", 21, Gender.MALE)
        };

        Arrays.sort(players);
        System.out.println(Arrays.toString(players));
    }
}
