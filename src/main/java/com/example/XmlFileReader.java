package com.example;

import com.example.configuration.Configuration;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.Files.readAllBytes;

public class XmlFileReader {
  
  public ByteArrayInputStream readXmlFile() {
    //YOUR CODE GOES HERE
    
    Path pathToFile = Paths.get(path);
    byte[] fileContentAsByteArray = readFilepathToByteArray(pathToFile);
    return new ByteArrayInputStream(fileContentAsByteArray);
  }
  
  private byte[] readFilepathToByteArray(Path path) {
    try {
      return readAllBytes(path);
    } catch (IOException e) {
      throw new IllegalArgumentException("Wrong file path!");
    }
  }
  
}
