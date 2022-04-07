package serhatcode.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamTwo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("burakduman.txt",true);
			//A value of true means that you want to append to the file,
			// whereas a value of false means you want to overwrite the file.
		//	fos.write(65);
		//	fos.write(70);
			byte[] array= {104,105,126};
			fos.write(array);
			String s= "Burak duman";
			fos.write(s.getBytes());
			//  getBytes() method used converts a string into bytes array.
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			fos.close();
		}
		System.out.println("Finish");
	}

}
