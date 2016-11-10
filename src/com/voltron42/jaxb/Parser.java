package com.voltron42.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.helpers.DefaultValidationEventHandler;
import javax.xml.transform.stream.StreamSource;
import java.io.InputStream;

/**
 * Created by daniel.johnson on 11/10/2016.
 */
public class Parser<T> {

    private final Unmarshaller unmarshaller;
    private final Class<T> type;

    private Parser(Unmarshaller unmarshaller, Class<T> type) {
        this.unmarshaller = unmarshaller;
        this.type = type;
    }

    public T parse(InputStream stream) throws ParserException {
        try {
            JAXBElement<T> result = unmarshaller.unmarshal(new StreamSource(stream), type);
            return result.getValue();
        } catch (JAXBException e) {
            throw new ParserException(e);
        }
    }

    public static class Factory {
        public <T> Parser<T> build(Class<T> type) throws ParserException {
            try {
                JAXBContext jaxbContext = JAXBContext.newInstance(type);
                Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
                unmarshaller.setEventHandler(new DefaultValidationEventHandler());
                Parser parser = new Parser(unmarshaller, type);
                return parser;
            } catch (JAXBException e) {
                throw new ParserException("failed to build parser", e);
            }
        }
    }}
