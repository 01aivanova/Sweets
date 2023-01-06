package org.sweets;

import org.sweets.Yummies.Candy;
import java.util.Arrays;

public class Present {
    private int price;
    private String name;
    private Candy[] candies;

    public Present(int price, String name, Candy[] candies) {
        this.price = price;
        this.name = name;
        this.candies = candies;
    }

    public int getPrice() {
        return price;
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

    @Override
    public String toString(){
        return name+" price is "+price+" USD "+ "\n"+ Arrays.toString(candies)+"\n";
    }


}



