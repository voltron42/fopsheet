package com.voltron42.charsheet.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.List;

/**
 * Created by daniel.johnson on 11/10/2016.
 */
@XmlRootElement(name="character")
public class CharacterSheet {

    private int version;
    private int initMiscMod;
    private int improvedInitiative;
    private int currentHealth;
    private int maxHealth;
    private int currentTempHP;
    private int armorBonus;
    private int shieldBonus;
    private int miscArmorBonus;
    private int maxDex;
    private int proficiencyBonus;
    private int miscSpellAttackBonus;
    private int miscSpellDCBonus;
    private int castingStatCode;
    private int offenseAbilityDisplay;
    private int deathSaveSuccesses;
    private int deathSaveFailures;
    private boolean showDeathSaves;
    private int baseSpeed;
    private int speedMiscMod;
    private String movementMode;
    private int raceCode;
    private int subraceCode;
    private int backgroundCode;
    private int pagePosition0;
    private int pagePosition1;
    private int pagePosition2;
    private int pagePosition3;
    private int pagePosition4;
    private int unarmoredDefense;
    private List<Integer> featCodes;
    private List<Integer> multiclassFeatures;
    private List<Weapon> weaponList;
    private Abilities abilityScores;
    private SkillProficiencies skillInfo;
    private SpellList spellList;
    private NoteList noteList;
    private HitDiceList hitDiceList;
    private ClassResource classResource;

    @XmlElement(name="version")
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @XmlElement(name="initMiscMod")
    public int getInitMiscMod() {
        return initMiscMod;
    }

    public void setInitMiscMod(int initMiscMod) {
        this.initMiscMod = initMiscMod;
    }

    @XmlElement(name="improvedInitiative")
    public int getImprovedInitiative() {
        return improvedInitiative;
    }

    public void setImprovedInitiative(int improvedInitiative) {
        this.improvedInitiative = improvedInitiative;
    }

    @XmlElement(name="currentHealth")
    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    @XmlElement(name="maxHealth")
    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    @XmlElement(name="currentTempHP")
    public int getCurrentTempHP() {
        return currentTempHP;
    }

    public void setCurrentTempHP(int currentTempHP) {
        this.currentTempHP = currentTempHP;
    }

    @XmlElement(name="armorBonus")
    public int getArmorBonus() {
        return armorBonus;
    }

    public void setArmorBonus(int armorBonus) {
        this.armorBonus = armorBonus;
    }

    @XmlElement(name="shieldBonus")
    public int getShieldBonus() {
        return shieldBonus;
    }

    public void setShieldBonus(int shieldBonus) {
        this.shieldBonus = shieldBonus;
    }

    @XmlElement(name="miscArmorBonus")
    public int getMiscArmorBonus() {
        return miscArmorBonus;
    }

    public void setMiscArmorBonus(int miscArmorBonus) {
        this.miscArmorBonus = miscArmorBonus;
    }

    @XmlElement(name="maxDex")
    public int getMaxDex() {
        return maxDex;
    }

    public void setMaxDex(int maxDex) {
        this.maxDex = maxDex;
    }

    @XmlElement(name="proficiencyBonus")
    public int getProficiencyBonus() {
        return proficiencyBonus;
    }

    public void setProficiencyBonus(int proficiencyBonus) {
        this.proficiencyBonus = proficiencyBonus;
    }

    @XmlElement(name="miscSpellAttackBonus")
    public int getMiscSpellAttackBonus() {
        return miscSpellAttackBonus;
    }

    public void setMiscSpellAttackBonus(int miscSpellAttackBonus) {
        this.miscSpellAttackBonus = miscSpellAttackBonus;
    }

    @XmlElement(name="miscSpellDCBonus")
    public int getMiscSpellDCBonus() {
        return miscSpellDCBonus;
    }

    public void setMiscSpellDCBonus(int miscSpellDCBonus) {
        this.miscSpellDCBonus = miscSpellDCBonus;
    }

    @XmlElement(name="castingStatCode")
    public int getCastingStatCode() {
        return castingStatCode;
    }

    public void setCastingStatCode(int castingStatCode) {
        this.castingStatCode = castingStatCode;
    }

    @XmlElement(name="offenseAbilityDisplay")
    public int getOffenseAbilityDisplay() {
        return offenseAbilityDisplay;
    }

    public void setOffenseAbilityDisplay(int offenseAbilityDisplay) {
        this.offenseAbilityDisplay = offenseAbilityDisplay;
    }

    @XmlElement(name="deathSaveSuccesses")
    public int getDeathSaveSuccesses() {
        return deathSaveSuccesses;
    }

    public void setDeathSaveSuccesses(int deathSaveSuccesses) {
        this.deathSaveSuccesses = deathSaveSuccesses;
    }

    @XmlElement(name="deathSaveFailures")
    public int getDeathSaveFailures() {
        return deathSaveFailures;
    }

    public void setDeathSaveFailures(int deathSaveFailures) {
        this.deathSaveFailures = deathSaveFailures;
    }

    @XmlElement(name="showDeathSaves")
    public boolean isShowDeathSaves() {
        return showDeathSaves;
    }

    public void setShowDeathSaves(boolean showDeathSaves) {
        this.showDeathSaves = showDeathSaves;
    }

    @XmlElement(name="baseSpeed")
    public int getBaseSpeed() {
        return baseSpeed;
    }

    public void setBaseSpeed(int baseSpeed) {
        this.baseSpeed = baseSpeed;
    }

    @XmlElement(name="speedMiscMod")
    public int getSpeedMiscMod() {
        return speedMiscMod;
    }

    public void setSpeedMiscMod(int speedMiscMod) {
        this.speedMiscMod = speedMiscMod;
    }

    @XmlElement(name="movementMode")
    public String getMovementMode() {
        return movementMode;
    }

    public void setMovementMode(String movementMode) {
        this.movementMode = movementMode;
    }

    @XmlElement(name="raceCode")
    public int getRaceCode() {
        return raceCode;
    }

    public void setRaceCode(int raceCode) {
        this.raceCode = raceCode;
    }

    @XmlElement(name="subraceCode")
    public int getSubraceCode() {
        return subraceCode;
    }

    public void setSubraceCode(int subraceCode) {
        this.subraceCode = subraceCode;
    }

    @XmlElement(name="backgroundCode")
    public int getBackgroundCode() {
        return backgroundCode;
    }

    public void setBackgroundCode(int backgroundCode) {
        this.backgroundCode = backgroundCode;
    }

    @XmlElement(name="pagePosition0")
    public int getPagePosition0() {
        return pagePosition0;
    }

    public void setPagePosition0(int pagePosition0) {
        this.pagePosition0 = pagePosition0;
    }

    @XmlElement(name="pagePosition1")
    public int getPagePosition1() {
        return pagePosition1;
    }

    public void setPagePosition1(int pagePosition1) {
        this.pagePosition1 = pagePosition1;
    }

    @XmlElement(name="pagePosition2")
    public int getPagePosition2() {
        return pagePosition2;
    }

    public void setPagePosition2(int pagePosition2) {
        this.pagePosition2 = pagePosition2;
    }

    @XmlElement(name="pagePosition3")
    public int getPagePosition3() {
        return pagePosition3;
    }

    public void setPagePosition3(int pagePosition3) {
        this.pagePosition3 = pagePosition3;
    }

    @XmlElement(name="pagePosition4")
    public int getPagePosition4() {
        return pagePosition4;
    }

    public void setPagePosition4(int pagePosition4) {
        this.pagePosition4 = pagePosition4;
    }

    @XmlElement(name="unarmoredDefense")
    public int getUnarmoredDefense() {
        return unarmoredDefense;
    }

    public void setUnarmoredDefense(int unarmoredDefense) {
        this.unarmoredDefense = unarmoredDefense;
    }

    @XmlElement(name="featCode")
    @XmlJavaTypeAdapter(value = IntListAdapter.class)
    public List<Integer> getFeatCodes() {
        return featCodes;
    }

    public void setFeatCodes(List<Integer> featCodes) {
        this.featCodes = featCodes;
    }

    @XmlElement(name="multiclassFeatures")
    @XmlJavaTypeAdapter(value = IntListAdapter.class)
    public List<Integer> getMulticlassFeatures() {
        return multiclassFeatures;
    }

    public void setMulticlassFeatures(List<Integer> multiclassFeatures) {
        this.multiclassFeatures = multiclassFeatures;
    }

    @XmlElement(name="weaponList")
    @XmlJavaTypeAdapter(value = WeaponListAdapter.class)
    public List<Weapon> getWeaponList() {
        return weaponList;
    }

    public void setWeaponList(List<Weapon> weaponList) {
        this.weaponList = weaponList;
    }

    @XmlElement(name="abilityScores")
    @XmlJavaTypeAdapter(value = AbilityAdapter.class)
    public Abilities getAbilityScores() {
        return abilityScores;
    }

    public void setAbilityScores(Abilities abilityScores) {
        this.abilityScores = abilityScores;
    }

    @XmlElement(name="skillInfo")
    @XmlJavaTypeAdapter(value = SkillProficienciesAdapter.class)
    public SkillProficiencies getSkillInfo() {
        return skillInfo;
    }

    public void setSkillInfo(SkillProficiencies skillInfo) {
        this.skillInfo = skillInfo;
    }

    @XmlElement(name="spellList")
    @XmlJavaTypeAdapter(value = SpellListAdapter.class)
    public SpellList getSpellList() {
        return spellList;
    }

    public void setSpellList(SpellList spellList) {
        this.spellList = spellList;
    }

    @XmlElement(name="noteList")
    @XmlJavaTypeAdapter(value = NoteListAdapter.class)
    public NoteList getNoteList() {
        return noteList;
    }

    public void setNoteList(NoteList noteList) {
        this.noteList = noteList;
    }

    @XmlElement(name="hitDiceList")
    @XmlJavaTypeAdapter(value = HitDiceListAdapter.class)
    public HitDiceList getHitDiceList() {
        return hitDiceList;
    }

    public void setHitDiceList(HitDiceList hitDiceList) {
        this.hitDiceList = hitDiceList;
    }

    @XmlElement(name="classResource")
    @XmlJavaTypeAdapter(value = ClassResourceAdapter.class)
    public ClassResource getClassResource() {
        return classResource;
    }

    public void setClassResource(ClassResource classResource) {
        this.classResource = classResource;
    }

    @Override
    public String toString() {
        return "CharacterSheet{\n" +
                "version=" + version +
                ",\n initMiscMod=" + initMiscMod +
                ",\n improvedInitiative=" + improvedInitiative +
                ",\n currentHealth=" + currentHealth +
                ",\n maxHealth=" + maxHealth +
                ",\n currentTempHP=" + currentTempHP +
                ",\n armorBonus=" + armorBonus +
                ",\n shieldBonus=" + shieldBonus +
                ",\n miscArmorBonus=" + miscArmorBonus +
                ",\n maxDex=" + maxDex +
                ",\n proficiencyBonus=" + proficiencyBonus +
                ",\n miscSpellAttackBonus=" + miscSpellAttackBonus +
                ",\n miscSpellDCBonus=" + miscSpellDCBonus +
                ",\n castingStatCode=" + castingStatCode +
                ",\n offenseAbilityDisplay=" + offenseAbilityDisplay +
                ",\n deathSaveSuccesses=" + deathSaveSuccesses +
                ",\n deathSaveFailures=" + deathSaveFailures +
                ",\n showDeathSaves=" + showDeathSaves +
                ",\n baseSpeed=" + baseSpeed +
                ",\n speedMiscMod=" + speedMiscMod +
                ",\n movementMode='" + movementMode + '\'' +
                ",\n raceCode=" + raceCode +
                ",\n subraceCode=" + subraceCode +
                ",\n backgroundCode=" + backgroundCode +
                ",\n pagePosition0=" + pagePosition0 +
                ",\n pagePosition1=" + pagePosition1 +
                ",\n pagePosition2=" + pagePosition2 +
                ",\n pagePosition3=" + pagePosition3 +
                ",\n pagePosition4=" + pagePosition4 +
                ",\n unarmoredDefense=" + unarmoredDefense +
                ",\n featCodes=" + featCodes +
                ",\n multiclassFeatures=" + multiclassFeatures +
                ",\n weaponList=" + weaponList +
                ",\n abilityScores=" + abilityScores +
                ",\n skillInfo=" + skillInfo +
                ",\n spellList=" + spellList +
                ",\n noteList=" + noteList +
                ",\n hitDiceList=" + hitDiceList +
                ",\n classResource=" + classResource +
                "\n}";
    }
}
