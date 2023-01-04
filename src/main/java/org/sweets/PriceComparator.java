package org.sweets;

import java.util.Comparator;

public class PriceComparator implements Comparator<Present> {

    public int compare(Present p1, Present p2) {
        if (p1.getPrice() == p2.getPrice()) {
            return 0;
        }
        if (p1.getPrice() > p2.getPrice()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
