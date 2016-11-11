package com.voltron42.charsheet.model;

/**
 * Created by daniel.johnson on 11/10/2016.
 */
public class NoteList {
    private final String features;
    private final String armorProficiencies;
    private final String weaponProficiencies;
    private final String toolProficiencies;
    private final String languages;
    private final String equipment;
    private final String alignment;
    private final String classAndLevel;
    private final String race;
    private final String background;
    private final String personalityTraits;
    private final String ideals;
    private final String bonds;
    private final String flaws;
    private final String notes;
    private final String name;
    private final int copper;
    private final int silver;
    private final int electrum;
    private final int gold;
    private final int platinum;
    private final int experience;

    public NoteList(
            String features,
            String armorProficiencies,
            String weaponProficiencies,
            String toolProficiencies,
            String languages,
            String equipment,
            String alignment,
            String classAndLevel,
            String race,
            String background,
            String personalityTraits,
            String ideals,
            String bonds,
            String flaws,
            String notes,
            String name,
            String classAndLevelConfirm,
            int copper,
            int silver,
            int electrum,
            int gold,
            int platinum,
            int experience
    ) {
        if (!classAndLevel.equals(classAndLevelConfirm)) {
            throw new RuntimeException("invalid ");
        }
        this.features = features;
        this.armorProficiencies = armorProficiencies;
        this.weaponProficiencies = weaponProficiencies;
        this.toolProficiencies = toolProficiencies;
        this.languages = languages;
        this.equipment = equipment;
        this.alignment = alignment;
        this.classAndLevel = classAndLevel;
        this.race = race;
        this.background = background;
        this.personalityTraits = personalityTraits;
        this.ideals = ideals;
        this.bonds = bonds;
        this.flaws = flaws;
        this.notes = notes;
        this.name = name;
        this.copper = copper;
        this.silver = silver;
        this.electrum = electrum;
        this.gold = gold;
        this.platinum = platinum;
        this.experience = experience;
    }

    public String getFeatures() {
        return features;
    }

    public String getArmorProficiencies() {
        return armorProficiencies;
    }

    public String getWeaponProficiencies() {
        return weaponProficiencies;
    }

    public String getToolProficiencies() {
        return toolProficiencies;
    }

    public String getLanguages() {
        return languages;
    }

    public String getEquipment() {
        return equipment;
    }

    public String getAlignment() {
        return alignment;
    }

    public String getClassAndLevel() {
        return classAndLevel;
    }

    public String getRace() {
        return race;
    }

    public String getBackground() {
        return background;
    }

    public String getPersonalityTraits() {
        return personalityTraits;
    }

    public String getIdeals() {
        return ideals;
    }

    public String getBonds() {
        return bonds;
    }

    public String getFlaws() {
        return flaws;
    }

    public String getNotes() {
        return notes;
    }

    public String getName() {
        return name;
    }

    public int getCopper() {
        return copper;
    }

    public int getSilver() {
        return silver;
    }

    public int getElectrum() {
        return electrum;
    }

    public int getGold() {
        return gold;
    }

    public int getPlatinum() {
        return platinum;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "NoteList{\n" +
                " features='" + features + '\'' +
                ",\n armorProficiencies='" + armorProficiencies + '\'' +
                ",\n weaponProficiencies='" + weaponProficiencies + '\'' +
                ",\n toolProficiencies='" + toolProficiencies + '\'' +
                ",\n languages='" + languages + '\'' +
                ",\n equipment='" + equipment + '\'' +
                ",\n alignment='" + alignment + '\'' +
                ",\n classAndLevel='" + classAndLevel + '\'' +
                ",\n race='" + race + '\'' +
                ",\n background='" + background + '\'' +
                ",\n personalityTraits='" + personalityTraits + '\'' +
                ",\n ideals='" + ideals + '\'' +
                ",\n bonds='" + bonds + '\'' +
                ",\n flaws='" + flaws + '\'' +
                ",\n notes='" + notes + '\'' +
                ",\n name='" + name + '\'' +
                ",\n copper=" + copper +
                ",\n silver=" + silver +
                ",\n electrum=" + electrum +
                ",\n gold=" + gold +
                ",\n platinum=" + platinum +
                ",\n experience=" + experience +
                "\n}";
    }
}
