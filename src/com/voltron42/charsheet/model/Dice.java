package com.voltron42.charsheet.model;

import java.util.Iterator;
import java.util.List;

/**
 * Created by daniel.johnson on 11/10/2016.
 */
public class Dice implements Iterable<Die> {

    private final List<Die> dice;

    public Dice(List<Die> dice) {
        this.dice = dice;
    }

    public List<Die> getDice() {
        return dice;
    }

    @Override
    public Iterator<Die> iterator() {
        return dice.iterator();
    }

    @Override
    public String toString() {
        return dice.toString();
    }
}
