package com.voltron42.charsheet.model;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * Created by daniel.johnson on 11/10/2016.
 */
public class AbilityAdapter extends XmlAdapter <String, Abilities> {
    @Override
    public Abilities unmarshal(String v) throws Exception {
        String[] values = v.split(Constants.DELIMITER);
        return new Abilities(
                new Ability(new Integer(values[0]), new Boolean(values[6]), new Integer(values[12])),
                new Ability(new Integer(values[1]), new Boolean(values[7]), new Integer(values[13])),
                new Ability(new Integer(values[2]), new Boolean(values[8]), new Integer(values[14])),
                new Ability(new Integer(values[3]), new Boolean(values[9]), new Integer(values[15])),
                new Ability(new Integer(values[4]), new Boolean(values[10]), new Integer(values[16])),
                new Ability(new Integer(values[5]), new Boolean(values[11]), new Integer(values[17]))
        );
    }

    @Override
    public String marshal(Abilities v) throws Exception {
        return null;
    }
}
