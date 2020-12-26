package by.itClass.handlers;

import by.itClass.User28;
import by.itClass.enums.UserFields28;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Objects;

public class UserHandler29 {
    private Document document;
    private User28 user;

    public User28 getUser() {
        return user;
    }

    public void parse(String filename) {
        Document doc = null;
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            doc = builder.parse(filename);
            document = doc;
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
        createUser();
    }

    private void createUser() {
        if (Objects.nonNull(document)) {
            user = new User28();
            Element root = document.getDocumentElement();
            NodeList nodes = root.getChildNodes();
            for (int i = 0; i < nodes.getLength(); i++) {
                Node node = nodes.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    System.out.println(node.getNodeName());
                    UserFields28 field = UserFields28.valueOf(node.getNodeName().toUpperCase());
                    if (field == UserFields28.ID) {
                        Element idTag = (Element) node;
                        int id = Integer.parseInt(idTag.getAttribute("id"));
                        user.setId(id);
                    } else {
                        String value =node.getTextContent();
                        switch (field) {
                            case NAME -> user.setName(value);
                            case PASSWORD -> user.setPassword(value);
                        }
                    }
                }
            }
        }
    }


}
