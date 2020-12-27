import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


/**
 * XML StAX
 */
public class Runner30_exm1 {
    public static void main(String[] args) {
        final String FILE_NAME = "lesson30/itClass.xml";
        XMLStreamReader parser = process(FILE_NAME);

        while (true) {
            try {
                if (!parser.hasNext()) break;
                int type = parser.next();
                switch (type) {
                    case XMLStreamConstants.START_ELEMENT -> {
                        System.out.println("start element: " + parser.getLocalName());
                        int AttrCount = parser.getAttributeCount();
                        if (AttrCount > 0) {
                            for (int i = 0; i < AttrCount; i++) {
                                System.out.println("attribute " + parser.getAttributeName(i) + "=" + parser.getAttributeValue(i));
                            }
                        }
                    }
                    case XMLStreamConstants.END_ELEMENT -> {
                        System.out.println("end element: " + parser.getLocalName());
                    }
                    case XMLStreamConstants.CHARACTERS -> {
                        System.out.println("characters: " + parser.getText());
                    }
                }
            } catch (XMLStreamException e) {
                e.printStackTrace();
            }
        }
        try {
            parser.close();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }

    private static XMLStreamReader process(String filename) {
        XMLStreamReader reader = null;
        FileInputStream stream = null;
        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            stream = new FileInputStream(filename);
            reader = factory.createXMLStreamReader(stream);
        } catch (XMLStreamException | FileNotFoundException e) {
            e.printStackTrace();
        } //finally {
//            if (stream!=null) {
//                try {
//                    stream.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }

        return reader;
    }
}
