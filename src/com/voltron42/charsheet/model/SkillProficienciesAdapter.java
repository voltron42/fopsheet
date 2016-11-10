package com.voltron42.charsheet.model;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by daniel.johnson on 11/10/2016.
 */
public class SkillProficienciesAdapter extends XmlAdapter<String, SkillProficiencies> {
    @Override
    public SkillProficiencies unmarshal(String v) throws Exception {
        List<String> skills = new ArrayList<String>(Arrays.asList(v.split(Constants.DELIMITER)));
        return new SkillProficiencies(
                new Boolean(skills.remove(0)),
                new Boolean(skills.remove(0)),
                new Boolean(skills.remove(0)),
                new Boolean(skills.remove(0)),
                new Boolean(skills.remove(0)),
                new Boolean(skills.remove(0)),
                new Boolean(skills.remove(0)),
                new Boolean(skills.remove(0)),
                new Boolean(skills.remove(0)),
                new Boolean(skills.remove(0)),
                new Boolean(skills.remove(0)),
                new Boolean(skills.remove(0)),
                new Boolean(skills.remove(0)),
                new Boolean(skills.remove(0)),
                new Boolean(skills.remove(0)),
                new Boolean(skills.remove(0)),
                new Boolean(skills.remove(0)),
                new Boolean(skills.remove(0))
        );
    }

    @Override
    public String marshal(SkillProficiencies v) throws Exception {
        return null;
    }
}
