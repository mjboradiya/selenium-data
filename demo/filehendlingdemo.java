package demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class filehendlingdemo {
 public static void main(String[] args) throws IOException {
	 String s = " file hendling by input output strime " ;
	 FileOutputStream fos = new FileOutputStream("t1.txt");
	 byte b[] = s.getBytes();
	 fos.write(b);
	 fos.flush();
	 fos.close();
	 System.out.println("file data written successfully");
	 
	 FileInputStream fis = new  FileInputStream("t1.txt");
	 int i ;
	 while(( i=fis.read()!= 1))
	 {
		 System.out.println( (char)i);
	 }
}
}
