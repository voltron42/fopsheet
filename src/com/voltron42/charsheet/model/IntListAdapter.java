package com.voltron42.charsheet.model;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniel.johnson on 11/10/2016.
 */
public class IntListAdapter extends XmlAdapter <String, List<Integer>> {
    @Override
    public List<Integer> unmarshal(String v) throws Exception {
        List<Integer> out = new ArrayList<Integer>();
        if (v.length() > 0) {
            String[] numbers = v.split(",");
            for (String number : numbers) {
                out.add(new Integer(number));
            }
        }
        return out;
    }

    @Override
    public String marshal(List<Integer> v) throws Exception {
        StringBuffer sb = new StringBuffer(v.get(0));
        for (int x = 1; x < v.size(); x++) {
            sb.append(",");
            sb.append(v.get(x).intValue());
        }
        return sb.toString();
    }
}
