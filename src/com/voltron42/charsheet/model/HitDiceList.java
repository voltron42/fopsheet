package com.voltron42.charsheet.model;

import java.util.List;

/**
 * Created by daniel.johnson on 11/10/2016.
 */
public class HitDiceList {

    private final List<HitDice> hitDice;

    public HitDiceList(List<HitDice> hitDice) {
        this.hitDice = hitDice;
    }

    public List<HitDice> getHitDice() {
        return hitDice;
    }

    @Override
    public String toString() {
        return hitDice.toString();
    }
}
