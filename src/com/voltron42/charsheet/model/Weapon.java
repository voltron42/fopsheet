package com.voltron42.charsheet.model;

/**
 * Created by daniel.johnson on 11/10/2016.
 */
public class Weapon {

    private final String name;
    private final String range;
    private final DamageType damageType;
    private final AbilityName abilityName;
    private final int magicAttackBonus;
    private final int miscAttackBonus;
    private final int magicDamageBonus;
    private final int miscDamageBonus;
    private final boolean proficientWithWeapon;
    private final boolean addAbilityModToDamage;
    private final Dice damageDice;

    public Weapon(String name, String range, DamageType damageType, AbilityName abilityName, int magicAttackBonus, int miscAttackBonus, int magicDamageBonus, int miscDamageBonus, boolean proficientWithWeapon, boolean addAbilityModToDamage, Dice damageDice) {
        this.name = name;
        this.range = range;
        this.damageType = damageType;
        this.abilityName = abilityName;
        this.magicAttackBonus = magicAttackBonus;
        this.miscAttackBonus = miscAttackBonus;
        this.magicDamageBonus = magicDamageBonus;
        this.miscDamageBonus = miscDamageBonus;
        this.proficientWithWeapon = proficientWithWeapon;
        this.addAbilityModToDamage = addAbilityModToDamage;
        this.damageDice = damageDice;
    }

    public String getName() {
        return name;
    }

    public String getRange() {
        return range;
    }

    public DamageType getDamageType() {
        return damageType;
    }

    public AbilityName getAbilityName() {
        return abilityName;
    }

    public int getMagicAttackBonus() {
        return magicAttackBonus;
    }

    public int getMiscAttackBonus() {
        return miscAttackBonus;
    }

    public int getMagicDamageBonus() {
        return magicDamageBonus;
    }

    public int getMiscDamageBonus() {
        return miscDamageBonus;
    }

    public boolean isProficientWithWeapon() {
        return proficientWithWeapon;
    }

    public boolean isAddAbilityModToDamage() {
        return addAbilityModToDamage;
    }

    public Dice getDamageDice() {
        return damageDice;
    }

    @Override
    public String toString() {
        return "Weapon{\n" +
                "name='" + name + '\'' +
                ",\n range='" + range + '\'' +
                ",\n damageType=" + damageType +
                ",\n abilityName=" + abilityName +
                ",\n magicAttackBonus=" + magicAttackBonus +
                ",\n miscAttackBonus=" + miscAttackBonus +
                ",\n magicDamageBonus=" + magicDamageBonus +
                ",\n miscDamageBonus=" + miscDamageBonus +
                ",\n proficientWithWeapon=" + proficientWithWeapon +
                ",\n addAbilityModToDamage=" + addAbilityModToDamage +
                ",\n damageDice=" + damageDice +
                "\n}";
    }
}
