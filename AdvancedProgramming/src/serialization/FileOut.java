package serialization;

import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
public class FileOut
{
public static void main(String[] args)
{
    Path file = Paths.get("/Users/wilmirnicanor/eclipse-workspace/AdvancedProgramming/src/serialization/Grades.txt");
    String s = "Online class of advanced programming using Microsoft Teams";
    byte[] data = s.getBytes();
    OutputStream output = null;
    try
      {
        output = new
        BufferedOutputStream(Files.newOutputStream(file, CREATE));
        output.write(data);
        output.flush();
        output.close();
      }
    catch(Exception e)
      {
         System.out.println("Message: " + e);
     }
  }
}