package com.voltron42.charsheet.model;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * Created by daniel.johnson on 11/10/2016.
 */
public class ClassResourceAdapter extends XmlAdapter<String, ClassResource> {
    @Override
    public ClassResource unmarshal(String v) throws Exception {
        return null;
    }

    @Override
    public String marshal(ClassResource v) throws Exception {
        return null;
    }
}
