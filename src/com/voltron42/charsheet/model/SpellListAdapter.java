package com.voltron42.charsheet.model;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * Created by daniel.johnson on 11/10/2016.
 */
public class SpellListAdapter extends XmlAdapter<String, SpellList> {
    @Override
    public SpellList unmarshal(String v) throws Exception {
        return null;
    }

    @Override
    public String marshal(SpellList v) throws Exception {
        return null;
    }
}
