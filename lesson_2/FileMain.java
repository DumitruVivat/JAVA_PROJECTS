package lesson_2;

import java.io.*;

public class FileMain {
  public static void main(String[] args) {
    // System.out.println("user:dir: " + System.getProperty("user.dir"));
    // System.out.println("home: "+System.getProperty("home"));
    // System.out.println("os.name: "+System.getProperty("os.name"));
    // System.out.println("version: "+System.getProperty("java.runtime.version" ));
    // System.out.println("name: "+System.getProperty("name" ));

    // String pathProject = System.getProperty("user.dir");
    // String pathFile = pathProject.concat("/file.txt");

    // try {
    // File file = new File("user.dir", "/file.txt");
    // if (file.createNewFile()) {
    // System.out.println("file.created");
    // } else {
    // System.out.println("file.existed");
    // }
    // } catch (Exception e) {
    // System.out.println("catch");
    // } finally {
    // System.out.println("finally");
    // }
    // String line = "empty";
    // try{
    // File file = new File(pathFile);
    // if (file.createNewFile()) {
    // System.out.println("file.created");
    // } else {
    // BufferedReader bufferedReader =
    // new BufferedReader(new FileReader(file));
    // System.out.println("file.existed");
    // line = bufferedReader.readLine();
    // bufferedReader.close();
    // }
    // } catch (Exception e) {
    // e.printStackTrace();
    // } finally {
    // System.out.println(line);
    // }

    // File file = new File("/Users/dumitruvivat" + "/.bash_profile");
    // if (file.isHidden()) {
    // System.out.println("File Hidden");
    // } else {
    // System.out.println("File Not Hidden");
    // }

    // System.out.println("lenght" + file.length());
    // System.out.println("last modifie: " + file.lastModified());

    // FilenameFilter filter = new FilenameFilter() {

    //   @Override
    //   public boolean accept(File dir, String name) {
    //     return name.endsWith(".txt");
    //   }
      
    // };
    // String[] paths;
    // File f = new File(".");
    // paths = f.list(filter);

    // for (String path : paths) {
    //   System.out.println(path);
    // }

    // File[] files = directory.listFiles();

    // if(files != null) {
    //   for (File file : files) {
    //     System.out.println(file.getName());
    //   }
    // }

    // File f = new File("user.dir");
    // if (f.mkdir()) { 
    //   System.out.println("Directory is crated");
    // } else {
    //   System.out.println("Directory cannot be created");
    // }

    // File oldName = new File("kaiba.dir");
    // File newdName = new File("list.dir");

    // if (oldName.renameTo(newdName)) {
    //   System.out.println("Renamed successfully");
    // } else {
    //   System.out.println("Error");
    // }

    // String pathProject = System.getProperty("user.dir");
    // String pathDir = pathProject.concat("/files");
    // File dir = new File(pathDir);
    // System.out.println(dir.getAbsolutePath());
    // if(dir.mkdir()) {
    //   System.out.println("+");
    // } else {
    //   System.out.println("-");
    // }
    // for(String fname : dir.list()) {
    //   System.out.println(fname);
    // }
  }
}
