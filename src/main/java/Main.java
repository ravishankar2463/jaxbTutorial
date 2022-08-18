import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;

public class Main {
    public static void main(String[] args) throws JAXBException, SAXException {
        JAXBContext context = JAXBContext.newInstance(ListProductDTO.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = sf.newSchema(new File("src/main/resources/schema.xsd"));
        unmarshaller.setSchema(schema);
        ListProductDTO temp = (ListProductDTO) unmarshaller.unmarshal(new File("src/main/resources/sample.xml"));

        System.out.println(temp.getProductsList());
    }
}
