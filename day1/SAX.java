package day1;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.helpers.DefaultHandler;

public class SAX extends DefaultHandler{

    boolean userId=false;
    boolean name=false;
    boolean email=false;

    String currentId,currentName,currentEmail;

   
    public static void main(String[] args) {
        
        try{


            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();

            parser.parse(null, null);
        }catch(Exception e){

        }
    }
}
