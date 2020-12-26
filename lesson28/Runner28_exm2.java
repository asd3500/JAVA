import by.itClass.handlers.UserHandler28;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

/**
 * XML SAX
 */
public class Runner28_exm2 {
    public static void main(String[] args) {
        //XML

        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();

            parser.parse("lesson28/itClass.xml", new UserHandler28());
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
