package org.sweets.Comparators;
import org.sweets.Yummies.Candy;
import java.util.Comparator;

public class CandyCaloriesComparator implements Comparator<Candy> {

    @Override
    public int compare(Candy c1, Candy c2){
        return Integer.compare(c1.getCalories(), c2.getCalories());
    }
}
