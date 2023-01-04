package org.sweets;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {

        TreeSet<Candy> candiesArrayList = new TreeSet<>();

        Candy candies0 = new Candy("Snickers", "ChocolateBar", 250);
        Candy candies1 = new Candy("Orbit", "Gum", 50);
        Candy candies2 = new Candy("JellyBeans", "SugarCandy", 150);

        candiesArrayList.add(candies0);
        candiesArrayList.add(candies1);
        candiesArrayList.add(candies2);

        for (Candy candy : candiesArrayList) {
            System.out.println(candy);
        }

        Present present = new Present("New Year Present", new Candy[]{
                candies0,
                candies1,
        });
        Present present2 = new Present("Christmas Present", new Candy[]{
                candies0,
                candies2,

        });

        System.out.println(present2.getName() + "\n" + Arrays.toString(present.getCandies()));
        System.out.println("The heaviest candy in the present is: " + present.findMaxCandyWeightName());
        System.out.println("The lightest candy in the present is: " + present.findMinCandyWeightName());
        System.out.println("Total present weight is: " + present.getTotalWeight() + " gram");

    }
}
