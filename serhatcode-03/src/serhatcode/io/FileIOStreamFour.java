package serhatcode.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamFour {

	public static void main(String[] args) throws IOException {
		FileInputStream fis =null;
		FileOutputStream fos = null;
		try {
			//yazd�rma
			fos = new FileOutputStream(new File("burakduman.txt"));
			String name = "Burak Duman 13.03.2022";
			fos.write(name.getBytes());
			
			//okuma
			fis = new FileInputStream(new File("burakduman.txt"));
			int value;
			String result = "";
			while((value=fis.read())!=-1) {
				result=result+(char)value;
			}
			System.out.println(result);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			fos.close();
			fis.close();
		}

	}

}
