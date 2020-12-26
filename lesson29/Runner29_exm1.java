import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * XML DOM
 */
public class Runner29_exm1 {
    public static void main(String[] args) {
        final String FILE_NAME = "lesson29/itClass.xml";

        Document document = parse(FILE_NAME);
        System.out.println(document);
        // root element
        Element root = document.getDocumentElement();
        System.out.println(root);

        NodeList nodeList = root.getChildNodes();

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                System.out.println("\nnode name: " + node.getNodeName());
                System.out.println("node value: " + node.getNodeValue());
                System.out.println("node text content: " + node.getTextContent());

                Element element = (Element) node;
            }
        }


    }

    private static Document parse(String filename) {
        Document document = null;
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            document = builder.parse(filename);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
        return document;
    }
}
