import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ParserConfigurationException, TransformerException, SAXException {
//        FileUtil.createFile();                        //amas wirdeba ioEXception
//        FileUtil.writeIntoFile("kandashvili");
//        FileUtil.readFile();
//        FileUtil.deleteFile();

        for (Students students : XmlUtil.parseXML()) {
            System.out.println(students);
        }


    }
}