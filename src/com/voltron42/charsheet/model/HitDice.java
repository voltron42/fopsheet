package com.voltron42.charsheet.model;

/**
 * Created by daniel.johnson on 11/10/2016.
 */
public class HitDice {

    private final int available;
    private final int sideCount;
    private final int total;

    public HitDice(int available, int sideCount, int total) {
        this.available = available;
        this.sideCount = sideCount;
        this.total = total;
    }

    @Override
    public String toString() {
        return "HitDice{\n" +
                " available=" + available +
                ",\n sideCount=" + sideCount +
                ",\n total=" + total +
                "\n}";
    }
}
