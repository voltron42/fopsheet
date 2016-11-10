package com.voltron42.charsheet;

import com.voltron42.charsheet.model.CharacterSheet;
import com.voltron42.jaxb.Parser;
import com.voltron42.jaxb.ParserException;

/**
 * Created by daniel.johnson on 11/10/2016.
 */
public class Parse {

    public static void main(String[] args) throws ParserException {
        Parser.Factory factory = new Parser.Factory();
        Parser<CharacterSheet> parser = factory.build(CharacterSheet.class);
        CharacterSheet characterSheet = parser.parse(Parse.class.getResourceAsStream("/charsheet/xml/sample2.xml"));
        System.out.println(characterSheet);
    }
}
