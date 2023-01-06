package org.sweets.Yummies;

import java.util.ArrayList;

public class Candy {

    private int weight;
    private String name;
    private int calories;

    public Candy(String name, int weight, int calories) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Name-" + name + ", Weight-" + weight + " gram , Calories-" + calories + "\n";
    }

//        This method is created to calculate the total weight of candies in the ArrayList<Candy> but it
//        newer worked, can't understand the reason.

        public int getWeightBox (ArrayList<Candy> candiesArrayList) {
        int sum = 0;
        for (Candy candy : candiesArrayList) {
            sum += candy.getWeight();
        }
        return sum;
    }



}


