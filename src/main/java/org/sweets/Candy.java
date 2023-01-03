package org.sweets;

public class Candy {

    private int weight;
    private String name;
    private String type;

    public Candy(String name, String type, int weight) {
        this.name = name;
        this.type = type;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Name: " + name + "," + " Type: " + type + "," + " Weight: " + weight + " gram \n";
    }

}
