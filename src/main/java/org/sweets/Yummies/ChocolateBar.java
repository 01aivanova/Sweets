package org.sweets.Yummies;

public class ChocolateBar extends Candy {
    String color;

    public ChocolateBar(String name, int weight, int calories, String color) {
        super(name, weight, calories);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "Name-" + getName() + " , Weight-" + getWeight() + " gram , Calories-" + getCalories() + " , Color-" + getColor() + "\n";
    }
}
