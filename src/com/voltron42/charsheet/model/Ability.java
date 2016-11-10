package com.voltron42.charsheet.model;

/**
 * Created by daniel.johnson on 11/10/2016.
 */
public class Ability {
    private final int score;
    private final boolean saveProficient;
    private final int bonus;

    public Ability(int score, boolean saveProficient, int bonus) {
        this.score = score;
        this.saveProficient = saveProficient;
        this.bonus = bonus;
    }

    public int getScore() {
        return score;
    }

    public int getModifier() {
        return (score - 10) / 2;
    }

    public boolean isSaveProficient() {
        return saveProficient;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "Ability{\n" +
                " score=" + score +
                ",\n modifier=" + getModifier() +
                ",\n saveProficient=" + saveProficient +
                ",\n bonus=" + bonus +
                "\n}";
    }
}
