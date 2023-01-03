package org.sweets;

public class Present {

    private String name;
    private Candy[] candies;

    public Present(String name, Candy[] candies) {
        this.name = name;
        this.candies = candies;
    }

    public Candy[] getCandies() {
        return candies;
    }

    public String getName() {
        return name;
    }

    public String findMaxCandyWeightName() {

        long maxWeight = 0;
        Candy maxCandyWeight = candies[0];
        for (Candy candies : candies) {
            if (candies.getWeight() > maxWeight) {
                maxWeight = candies.getWeight();
                maxCandyWeight = candies;
            }
        }
        return maxCandyWeight.getName();

    }

    public String findMinCandyWeightName() {
        if (candies.length == 0) {
            return "No Candy";
        }
        long minWeight = Integer.MAX_VALUE;
        Candy minCandyWeight = candies[0];
        for (Candy candies : candies) {
            if (candies.getWeight() < minWeight) {
                minWeight = candies.getWeight();
                minCandyWeight = candies;
            }
        }
        return minCandyWeight.getName();

    }

    public int getTotalWeight() {
        int sum = 0;
        for (Candy candies : candies) {
            sum += candies.getWeight();
        }
        return sum;
    }

}


