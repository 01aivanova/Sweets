package org.sweets;

import org.sweets.Comparators.CandyCaloriesComparator;
import org.sweets.Comparators.CandyWeightComparator;
import org.sweets.Comparators.PresentPriceComparator;
import org.sweets.Yummies.Candy;
import org.sweets.Yummies.ChocolateBar;
import org.sweets.Yummies.Gum;
import org.sweets.Yummies.SugarCandy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Candy candies0 = new ChocolateBar("Snickers", 30, 1000, "Dark");
        Candy candies1 = new Gum("Orbit", 50, 10, "Sugar Mint");
        Candy candies2 = new SugarCandy("JellyBeans", 150, 550, "Strawberry");

        ArrayList<Candy> candiesArrayList = new ArrayList<>();
        candiesArrayList.add(candies0);
        candiesArrayList.add(candies1);
        candiesArrayList.add(candies2);

        System.out.println("Sorting by calories:");
        CandyCaloriesComparator candyCaloriesComparator = new CandyCaloriesComparator();
        candiesArrayList.sort(candyCaloriesComparator);
        for (Candy candy : candiesArrayList) {
            System.out.println(candy.toString());
        }

        System.out.println("Sorting by weight:");
        CandyWeightComparator candyWeightComparator = new CandyWeightComparator();
        candiesArrayList.sort(candyWeightComparator);
        for (Candy candy : candiesArrayList) {
            System.out.println(candy.toString());
        }


        ArrayList<Present> presentArrayList = new ArrayList<>();
        Present present = new Present(100, "New Year Present", new Candy[]{
                candies0,
                candies1,
        });
        Present present2 = new Present(50, "Christmas Present", new Candy[]{
                candies2,
                candies0,
        });
        Present present3 = new Present(250, "Birthday Present", new Candy[]{
                candies1,
                candies2,
        });
        presentArrayList.add(present);
        presentArrayList.add(present2);
        presentArrayList.add(present3);
        PresentPriceComparator presentPriceComparator = new PresentPriceComparator();
        presentArrayList.sort(presentPriceComparator);
        System.out.println("Present sorted by price: \n");
        for (Present presents : presentArrayList) {
            System.out.println(presents.toString());
        }


        System.out.println(present2.getName() + "\n" + Arrays.toString(present2.getCandies()));
        System.out.println("The heaviest candy in the " + present.getName() + " is: "
                + present.findMaxCandyWeightName());
        System.out.println("The lightest candy in the" + present.getName() + " is: "
                + present.findMinCandyWeightName());
        System.out.println("Total " + present.getName() + " weight is: "
                + present.getTotalWeight() + " gram");


        System.out.println("Please enter the number from 1-9 to see the presents' price");
        int number0 = scanner.nextInt();
        if (number0 > 9 || number0 < 1) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Oops, looks like you misprinted, please enter the number from 1-9 ");
            }
        }
        switch (number0) {
            case 1, 2, 3 -> System.out.println("Great choice, you picked " + present.getName() +
                    ", the total cost is " + present.getPrice() + " USD " + "\n");
            case 4, 5, 6 -> System.out.println("Great choice, you picked " + present2.getName() +
                    ", the total cost is " + present2.getPrice() + " USD " + "\n");
            case 7, 8, 9 -> System.out.println("Great choice, you picked " + present3.getName() +
                    ", the total cost is " + present3.getPrice() + " USD " + "\n");
        }


        System.out.println("Please enter the number from 1-9 to see the presents' content ");
        int number1 = scanner.nextInt();
        if (number1 > 9 || number1 < 1) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Oops, looks like you misprinted, please enter the number from 1-9 ");
            }
        }
        switch (number1) {
            case 1, 2, 3 -> System.out.println("Great choice, you picked " + present.getName() + "\n" +
                    Arrays.toString(present2.getCandies()) + "\n");
            case 4, 5, 6 -> System.out.println("Great choice, you picked " + present2.getName() + "\n" +
                    Arrays.toString(present2.getCandies()) + "\n");
            case 7, 8, 9 -> System.out.println("Great choice, you picked " + present3.getName() + "\n" +
                    Arrays.toString(present2.getCandies()) + "\n");
        }
    }
}
