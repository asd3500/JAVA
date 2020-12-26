package by.itClass.handlers;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class UserHandler28 extends DefaultHandler {

    @Override
    public void startDocument() throws SAXException {
        System.out.println("START DOCUMENT");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("END DOCUMENT");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("start tag - name: " + qName + ", attr:" + attributes.getQName(0) +
                ",attr value:" + attributes.getValue(0));

    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("end tag - name: " + qName);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String value = new String(ch, start, length).trim();
        if (!value.isEmpty()) {
            System.out.println("value: " + value);
        }
    }
}
