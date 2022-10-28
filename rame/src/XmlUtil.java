import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XmlUtil {
    public static void createXML() throws ParserConfigurationException, TransformerException {

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.newDocument();


        Element studentsElements = document.createElement("students");
        document.appendChild(studentsElements);

        Element lashaElement = document.createElement("student");
        studentsElements.appendChild(lashaElement);

        Attr attr = document.createAttribute("GroupNumber");
        attr.setValue("123");
        lashaElement.setAttributeNode(attr);

        Element lashaFirstName = document.createElement("FirstName");
        lashaFirstName.appendChild(document.createTextNode("lasha"));
        lashaElement.appendChild(lashaFirstName);

        Element lashaLastName = document.createElement("LastName");
        lashaLastName.appendChild(document.createTextNode("kandashvili"));
        lashaElement.appendChild(lashaLastName);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource domSource = new DOMSource(document);

        StreamResult streamResult = new StreamResult(new File("lasha.xml"));
        transformer.transform(domSource, streamResult);
    }
    public static List<Students> parseXML() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(new File("lasha.xml"));
        document.getDocumentElement().normalize();

        NodeList students = document.getElementsByTagName("student");

        List<Students> studentsList = new ArrayList<>();

        for (int i = 0; i < students.getLength(); i++) {
            Node node = students.item(i);
            Element element = (Element) node;

            String output = element.getAttribute("GroupNumber");
            String firstName = element.getElementsByTagName("FirstName").item(0).getTextContent();
            String lastName = element.getElementsByTagName("LastName").item(0).getTextContent();

            studentsList.add(new Students(
                    output,
                    firstName,
                    lastName
            ));
        }
        return studentsList;
    }

}
