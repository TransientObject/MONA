package myapp;
import java.io.*;
import javax.swing.*;
 import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;
/**
 *
 * @author san
 */

  




public class CreateJarFile {
 /* public static int BUFFER_SIZE = 10240;
  protected void createJarArchive(File archiveFile, File[] tobeJared) {
    try {
      byte buffer[] = new byte[BUFFER_SIZE];
      // Open archive file
      FileOutputStream stream = new FileOutputStream(archiveFile);
      JarOutputStream out = new JarOutputStream(stream, new Manifest());
      for (int i = 0; i < tobeJared.length; i++) {
        if (tobeJared[i] == null || !tobeJared[i].exists())
          continue; // Just in case...
        System.out.println("Adding " + tobeJared[i].getName());
        // Add archive entry
        JarEntry jarAdd = new JarEntry(tobeJared[i].getPath());
        jarAdd.setTime(tobeJared[i].lastModified());
        out.putNextEntry(jarAdd);
        // Write file to archive
        FileInputStream in = new FileInputStream(tobeJared[i].getParentFile());
        while (true) {
          int nRead = in.read(buffer, 0, buffer.length);
          if (nRead <= 0)
            break;
          out.write(buffer, 0, nRead);
                in.close();
      }
     
      }
      out.close();
      stream.close();
      System.out.println("Adding completed OK");
    } catch (Exception ex) {
      ex.printStackTrace();
      System.out.println("Error: " + ex.getMessage());
    }
  }*/
  public static void main(String[] a)throws Exception
  {
      CreateJarFile cf=new CreateJarFile();
      //File f=new File("../ensuring\\build\\web/");
     // File[] ff=f.listFiles();
    //  File fg=new File("../ensuring\\build\\web\\myapp.jar");
   //   cf.createJarArchive(fg,ff );  //File f=new File("../ensuring\\build\\web/");
     // File[] ff=f.listFiles();
    //  File fg=new File("../ensuring\\build\\web\\myapp.jar");
   //   cf.createJarArchive(fg
       //cf.createJarArchive(fg,listDir);
                Runtime.getRuntime().exec("jar cf C:/myapp.jar images/");  
       // Runtime.getRuntime().exec("jar cvf myapp.jar images/");
             /* File dir = new File("C:/");
                File listDir[] = dir.listFiles();
                for (int i = 0; i < listDir.length; i++) {
                       if (listDir[i].isDirectory()) {
                                System.out.println(listDir[i].getName());
                        }
                }
       */
  }
}