package com.example;

import com.example.model.Order;
import org.milyn.Smooks;
import org.milyn.container.ExecutionContext;
import org.milyn.payload.JavaResult;
import org.xml.sax.SAXException;

import javax.xml.transform.stream.StreamSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class XmlMapper {
  
  public Order xmlOrderToJavaOrder(ByteArrayInputStream xmlFileByteContent) throws IOException, SAXException {
  
    // Your Code Goes Here
    
  }
  
}
