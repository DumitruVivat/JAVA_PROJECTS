package lesson_2;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.*;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;
import java.nio.file.*;
import java.io.*;

public class LoggerMain {
  public static void main(String[] args) {

    // Logger logger = Logger.getLogger(LoggerMain.class.getName());
    // logger.setLevel(Level.INFO);
    // ConsoleHandler ch = new ConsoleHandler();
    // logger.addHandler(ch);
    // SimpleFormatter sFormat = new SimpleFormatter();
    // ch.setFormatter(sFormat);
    // logger.log(Level.WARNING, "Logging test");
    // logger.info("Logging test");

    // Logger logger = Logger.getLogger(LoggerMain.class.getName());
    // logger.setLevel(Level.INFO);
    // ConsoleHandler ch = new ConsoleHandler();
    // XMLFormatter xml = new XMLFormatter();
    // ch.setFormatter(xml);
    // logger.log(Level.WARNING, "Test logging");
    // logger.info("Test logging");

    String filePath = "user.dir";
    byte[] dataToWrite = {0x01, 0x02, 0x03, 0x04, 0x05};

    if (!fileExists(filePath)) {
      writeBinaryFile(filePath, dataToWrite);
    }

    byte[] dataRead = readBinaryFile(filePath);
    System.out.println("Reading data: " + java.util.Arrays.toString(dataRead));
  }

  private static final Logger logger = Logger.getLogger(LoggerMain.class.getName());

  static{
    try{
      FileHandler fileHandler = new FileHandler("application.log", true);
      fileHandler.setFormatter(new SimpleFormatter());
      logger.addHandler(fileHandler);
    } catch (IOException e) {
      System.err.println("The logger can't be setted: " + e.getMessage());
    }
  }
  public static void writeBinaryFile(String filePath, byte[] data) {
    try(FileOutputStream fos = new FileOutputStream(filePath)) {
      logger.info("Data was succesffuly saved: " + filePath);
    } catch (IOException e) {
      logger.severe("Error , data can't be saved: " + e.getMessage());
    }
  }

  public static byte[] readBinaryFile(String filePath) {
    try(FileInputStream fis = new FileInputStream(filePath)) {
      byte[] data = fis.readAllBytes();
      logger.info("Data was succesffuly saved: " + filePath);
      return data;
    } catch (IOException e) {
      return new byte[0];
    }
  }

  public static boolean fileExists(String filePath) {
    boolean exists = Files.exists(Paths.get(filePath));
    logger.info("Checking if file exists " + filePath + ": " + exists);
    return exists;
  }
}
