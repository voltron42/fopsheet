package com.voltron42.charsheet.model;

/**
 * Created by daniel.johnson on 11/10/2016.
 */
public class SkillProficiencies {

    private final boolean acrobatics;
    private final boolean animalHandling;
    private final boolean arcana;
    private final boolean athletics;
    private final boolean deception;
    private final boolean history;
    private final boolean insight;
    private final boolean intimidation;
    private final boolean investigation;
    private final boolean medicine;
    private final boolean nature;
    private final boolean perception;
    private final boolean performance;
    private final boolean persuation;
    private final boolean religion;
    private final boolean sleightOfHand;
    private final boolean stealth;
    private final boolean survival;


    public SkillProficiencies(boolean acrobatics, boolean animalHandling, boolean arcana, boolean athletics, boolean deception, boolean history, boolean insight, boolean intimidation, boolean investigation, boolean medicine, boolean nature, boolean perception, boolean performance, boolean persuation, boolean religion, boolean sleightOfHand, boolean stealth, boolean survival) {
        this.acrobatics = acrobatics;
        this.animalHandling = animalHandling;
        this.arcana = arcana;
        this.athletics = athletics;
        this.deception = deception;
        this.history = history;
        this.insight = insight;
        this.intimidation = intimidation;
        this.investigation = investigation;
        this.medicine = medicine;
        this.nature = nature;
        this.perception = perception;
        this.performance = performance;
        this.persuation = persuation;
        this.religion = religion;
        this.sleightOfHand = sleightOfHand;
        this.stealth = stealth;
        this.survival = survival;
    }

    public boolean isAcrobatics() {
        return acrobatics;
    }

    public boolean isAnimalHandling() {
        return animalHandling;
    }

    public boolean isArcana() {
        return arcana;
    }

    public boolean isAthletics() {
        return athletics;
    }

    public boolean isDeception() {
        return deception;
    }

    public boolean isHistory() {
        return history;
    }

    public boolean isInsight() {
        return insight;
    }

    public boolean isIntimidation() {
        return intimidation;
    }

    public boolean isInvestigation() {
        return investigation;
    }

    public boolean isMedicine() {
        return medicine;
    }

    public boolean isNature() {
        return nature;
    }

    public boolean isPerception() {
        return perception;
    }

    public boolean isPerformance() {
        return performance;
    }

    public boolean isPersuation() {
        return persuation;
    }

    public boolean isReligion() {
        return religion;
    }

    public boolean isSleightOfHand() {
        return sleightOfHand;
    }

    public boolean isStealth() {
        return stealth;
    }

    public boolean isSurvival() {
        return survival;
    }
}