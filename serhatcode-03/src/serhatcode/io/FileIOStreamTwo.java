package serhatcode.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamTwo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("burakduman.txt",true);
			fos.write(65);
			fos.write(70);
			byte[] array= {101,100,90,95};
			fos.write(array);
			String s= "Burak duman";
			fos.write(s.getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			fos.close();
		}
		System.out.println("Finish");
	}

}
