package org.sweets.Yummies;

public class SugarCandy extends Candy {
    String smell;

    public SugarCandy(String name, int weight, int calories, String smell) {
        super(name, weight, calories);
        this.smell = smell;
    }

    public String getSmell() {
        return smell;
    }

    public String toString() {
        return "Name-" + getName() + " , Weight-" + getWeight() + " gram , Calories-" + getCalories() + " , Smell-" + getSmell() + "\n";
    }


}
