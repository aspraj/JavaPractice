package practice;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class HowToWriteDataInTextFile {
//  public static void main(String[] args) {
//    try{
//      FileOutputStream fos = new FileOutputStream("C:\\Users\\apatel\\Downloads\\newJAVA.txt");
//      fos.write("Hello World".getBytes());
//      fos.close();
//    }
//    catch(Exception e){
//      System.out.println(e.getMessage());
//    }
//  }
//public static void main(String[] args) {
//  try{
//    FileInputStream fis = new FileInputStream("C:\\Users\\apatel\\Downloads\\newJAVA.txt");
//    int i;
//    while((i=fis.read())!=-1){
//      System.out.print((char)i);
//    }
//    System.out.println(" "+(char)fis.read());
//    fis.close();
//  }
//  catch(Exception e){
//    System.out.println(e.getMessage());
//  }
//}

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\apatel\\Downloads\\newJAVA.txt"));
    String s ;
    while((s = br.readLine())!= null){
      System.out.println(s);
    }
  }
}
