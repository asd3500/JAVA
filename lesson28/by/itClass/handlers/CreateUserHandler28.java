package by.itClass.handlers;

import by.itClass.User28;
import by.itClass.enums.UserFields28;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.Objects;

public class CreateUserHandler28 extends DefaultHandler {
    private User28 user;
    private UserFields28 field;

    public User28 getUser() {
        return user;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("user")) {
            user = new User28();
        } else if (qName.equals("id")) {
            int id = Integer.parseInt(attributes.getValue("id"));
            user.setId(id);
        } else {
            field = UserFields28.valueOf(qName.toUpperCase());
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String value = new String(ch, start, length).trim();
        if (Objects.nonNull(field)) {
            switch (field) {
                case NAME -> user.setName(value);
                case PASSWORD -> user.setPassword(value);
            }
            field = null;
        }
    }
}
