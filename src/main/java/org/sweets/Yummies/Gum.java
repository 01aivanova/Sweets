package org.sweets.Yummies;

public class Gum extends Candy {
    private String taste;

    public Gum(String name, int weight, int calories, String taste) {
        super(name, weight, calories);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public String toString() {
        return "Name-" + getName() + " , Weight-" + getWeight() + " gram , Calories-" + getCalories() + " , Taste-" + getTaste() + "\n";
    }
}
