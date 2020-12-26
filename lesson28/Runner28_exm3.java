import by.itClass.handlers.CreateUserHandler28;
import by.itClass.handlers.UserHandler28;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

/**
 * XML SAX
 */
public class Runner28_exm3 {
    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            CreateUserHandler28 handler = new CreateUserHandler28();
            parser.parse("lesson28/itClass.xml", handler);

            System.out.println(handler.getUser());
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
