package com.voltron42.charsheet.model;

/**
 * Created by daniel.johnson on 11/10/2016.
 */
public class Abilities {
    private final Ability strength;
    private final Ability dexterity;
    private final Ability constitution;
    private final Ability intelligence;
    private final Ability wisdom;
    private final Ability charisma;

    public Abilities(Ability strength, Ability dexterity, Ability constitution, Ability intelligence, Ability wisdom, Ability charisma) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    public Ability getStrength() {
        return strength;
    }

    public Ability getDexterity() {
        return dexterity;
    }

    public Ability getConstitution() {
        return constitution;
    }

    public Ability getIntelligence() {
        return intelligence;
    }

    public Ability getWisdom() {
        return wisdom;
    }

    public Ability getCharisma() {
        return charisma;
    }

    @Override
    public String toString() {
        return "Abilities{\n" +
                "strength=" + strength +
                ",\n dexterity=" + dexterity +
                ",\n constitution=" + constitution +
                ",\n intelligence=" + intelligence +
                ",\n wisdom=" + wisdom +
                ",\n charisma=" + charisma +
                "\n}";
    }
}
