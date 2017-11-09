package com.example;

import org.xml.sax.SAXException;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class EdiOrderToJava {
  
  public static void main(String... args) throws IOException, SAXException {
  
    XmlFileReader xmlFileReader = new XmlFileReader();
    ByteArrayInputStream byteArrayInputStream = xmlFileReader.readXmlFile();
    
    // Your Code Goes Here
    
  }
}
