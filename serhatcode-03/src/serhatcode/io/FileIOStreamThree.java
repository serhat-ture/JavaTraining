package serhatcode.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIOStreamThree {

	public static void main(String[] args) {
		FileInputStream fis;
		try {
			fis = new FileInputStream("burakduman.txt");
			int a = fis.read();
			fis.skip(-1);
			int c = fis.read();
			char b = (char) a;
			System.out.println("a value :"+a);
			System.out.println("b value :"+b);
			System.out.println("c value :"+(char)c);
			
			int value;
			while((value=fis.read())!=-1) {
				System.out.print((char)value);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
