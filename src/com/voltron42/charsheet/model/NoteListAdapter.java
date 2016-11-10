package com.voltron42.charsheet.model;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by daniel.johnson on 11/10/2016.
 */
public class NoteListAdapter extends XmlAdapter<String, NoteList> {
    @Override
    public NoteList unmarshal(String v) throws Exception {
        List<String> values = new ArrayList<String>(Arrays.asList(v.split(Constants.DELIMITER)));
        return new NoteList(
                values.remove(0),
                values.remove(0),
                values.remove(0),
                values.remove(0),
                values.remove(0),
                values.remove(0),
                values.remove(0),
                values.remove(0),
                values.remove(0),
                values.remove(0),
                values.remove(0),
                values.remove(0),
                values.remove(0),
                values.remove(0),
                values.remove(0),
                values.remove(0),
                new Integer(values.remove(0)),
                new Integer(values.remove(0)),
                new Integer(values.remove(0)),
                new Integer(values.remove(0)),
                new Integer(values.remove(0)),
                new Integer(values.remove(0))
        );
    }

    @Override
    public String marshal(NoteList v) throws Exception {
        return null;
    }
}
