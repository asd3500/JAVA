import by.itClass.User30;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;

/**
 * JAXB
 */
public class Runner30_exm2 {
    public static void main(String[] args) {
        final String FILE_NAME = "lesson30/itClass.xml";
        final String FILE_NAME_OUT = "lesson30/itClass_out.xml";
        Reader reader = null;
        Writer writer = null;
        User30 user = null;
        try {
            JAXBContext context = JAXBContext.newInstance(User30.class);
            Unmarshaller um = context.createUnmarshaller();
            user = (User30) um.unmarshal(reader = new FileReader(FILE_NAME));

            user.setId(10);
            user.setName("admin");
            user.setPassword("sdfsdf");

            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            m.marshal(user, writer = new FileWriter(FILE_NAME_OUT));
        } catch (JAXBException | IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(user);
    }
}
