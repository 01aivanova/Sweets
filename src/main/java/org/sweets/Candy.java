package org.sweets;

public class Candy implements Comparable<Candy> {

    public int weight;
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


    @Override
    public int compareTo(Candy anotherCandy) {
        if (this.weight == anotherCandy.weight) {
            return 0;
        } else if (this.weight < anotherCandy.weight) {
            return -1;
        } else {
            return 1;
        }
    }
}


