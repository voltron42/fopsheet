package com.voltron42.charsheet.model;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by daniel.johnson on 11/10/2016.
 */
public class HitDiceListAdapter extends XmlAdapter<String, HitDiceList> {
    @Override
    public HitDiceList unmarshal(String v) throws Exception {
        List<String> values = new ArrayList<String>(Arrays.asList(v.split(Constants.DELIMITER)));
        List<HitDice> hitDice = new ArrayList<HitDice>();
        int count = new Integer(values.remove(0));
        while (count > 0) {
            hitDice.add(new HitDice(new Integer(values.remove(0)),new Integer(values.remove(0)),new Integer(values.remove(0))));
            count--;
        }
        return new HitDiceList(hitDice);
    }

    @Override
    public String marshal(HitDiceList v) throws Exception {
        return null;
    }
}
