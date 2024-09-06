package lesson_2;

import java.io.File;
import java.io.IOException;

public class FileMain {
  public static void main(String[] args) {
    // System.out.println("user:dir: " + System.getProperty("user.dir"));
    // System.out.println("home: "+System.getProperty("home"));
    // System.out.println("os.name: "+System.getProperty("os.name"));
    // System.out.println("version: "+System.getProperty("java.runtime.version" ));
    // System.out.println("name: "+System.getProperty("name" ));

    try {
      String pathProject = System.getProperty("user.dir");
      String pathFile = pathProject.concat("/file.txt");
      File f3 = new File(pathFile);
      System.out.println("try");
    } catch (Exception e) {
      System.out.println("catch");
    } finally {
      System.out.println("finally");
    }
  }
}
