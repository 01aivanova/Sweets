package org.sweets.Comparators;

import org.sweets.Present;

import java.util.Comparator;

public class PresentPriceComparator implements Comparator<Present> {

    @Override
    public int compare(Present p1, Present p2) {
        return Integer.compare(p1.getPrice(), p2.getPrice());
    }
}
