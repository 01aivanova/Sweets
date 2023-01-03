package org.sweets;


import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        Candy candies = new Candy("Snickers", "ChocolateBar", 250);
        Candy candies1 = new Candy("Orbit", "Gum", 50);
        Candy candies2 = new Candy("JellyBeans", "SugarCandy", 150);

        Present present = new Present("New Year Present", new Candy[]{
                candies,
                candies1,
        });
        Present present2 = new Present("Christmas Present", new Candy[]{
                candies,
                candies2,

        });

        System.out.println(present.getName() + "\n" + Arrays.toString(present.getCandies()));
        System.out.println("The heaviest candy in the present is: " + present.findMaxCandyWeightName());
        System.out.println("The lightest candy in the present is: " + present.findMinCandyWeightName());
        System.out.println("Total present weight is: " + present.getTotalWeight() + " gram");

    }
}
