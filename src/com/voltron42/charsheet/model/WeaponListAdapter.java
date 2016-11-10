package com.voltron42.charsheet.model;

import com.voltron42.jaxb.ParserException;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by daniel.johnson on 11/10/2016.
 */
public class WeaponListAdapter extends XmlAdapter <String, List<Weapon>> {
    @Override
    public List<Weapon> unmarshal(String v) throws Exception {
        List<String> values = new ArrayList<String>(Arrays.asList(v.split(Constants.DELIMITER)));
        System.out.println(values);
        System.out.println(values.size());
        List<Weapon> weapons = new ArrayList<Weapon>();
        int count = new Integer(values.remove(0)).intValue();
        while(values.size()>0) {
            String name = values.remove(0);
            String range = values.remove(0);
            DamageType damageType = DamageType.values()[new Integer(values.remove(0)).intValue() - 1];
            AbilityName abilityName = AbilityName.values()[new Integer(values.remove(0)).intValue()];
            int magicAttackBonus = new Integer(values.remove(0)).intValue();
            int miscAttackBonus = new Integer(values.remove(0)).intValue();
            int magicDamageBonus = new Integer(values.remove(0)).intValue();
            int miscDamageBonus = new Integer(values.remove(0)).intValue();
            boolean proficientWithWeapon = new Boolean(values.remove(0)).booleanValue();
            boolean addAbilityModToDamage = new Boolean(values.remove(0)).booleanValue();
            List<Die> dice = new ArrayList<Die>();
            int diceCount = new Integer(values.remove(0)).intValue();
            while (diceCount > 0) {
                dice.add(new Die(new Integer(values.remove(0)).intValue(), new Integer(values.remove(0)).intValue()));
                diceCount--;
            }
            weapons.add(new Weapon(name, range, damageType, abilityName, magicAttackBonus, miscAttackBonus, magicDamageBonus, miscDamageBonus, proficientWithWeapon, addAbilityModToDamage, new Dice(dice)));
            System.out.println(weapons.size());
        }
        if (weapons.size() != count) {
            throw new ParserException("malformed weaponList");
        }
        return weapons;
    }

    @Override
    public String marshal(List<Weapon> v) throws Exception {
        return null;
    }
}
