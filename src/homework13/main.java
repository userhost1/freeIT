package homework13;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;

public class main {
    public static void main(String[] args) {
        boolean result = validatorXMLSchema("D:/ONLINE_freeIT/src/homework13/devices.xsd", "D:/ONLINE_freeIT/src/homework13/devicesCatalogue.xml");
        System.out.println("Schema is valid: " + result);
    }

    public static boolean validatorXMLSchema(String xsdPath, String xmlPath) {
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return false;
        }
        return true;
    }
}
