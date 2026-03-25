package day1;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.*;

public class dom {
    public static void main(String[] args) {
        try{
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder= factory.newDocumentBuilder();
            Document document = builder.parse("user.xml");

            document.getDocumentElement().normalize();

            NodeList nodeList = document.getElementsByTagName("user");
            
            for (int i = 0; i < args.length; i++) {
                Element user = (Element)nodeList.item(i);
                String userId=user.getElementsByTagName("userId").item(0).getTextContent();

                if(userId.equals("101")){
                    
                }
            }
        }catch(Exception e){

        }

    }
}
