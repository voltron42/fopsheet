package com.voltron42.charsheet.model;

/**
 * Created by daniel.johnson on 11/10/2016.
 */
public class Die {
    private final int numberOf;
    private final int sideCount;

    public Die(int numberOf, int sideCount) {
        this.numberOf = numberOf;
        this.sideCount = sideCount;
    }

    public int getNumberOf() {
        return numberOf;
    }

    public int getSideCount() {
        return sideCount;
    }

    @Override
    public String toString() {
        return "Die{\n" +
                "numberOf=" + numberOf +
                ",\n sideCount=" + sideCount +
                "\n}";
    }
}
