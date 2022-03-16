package serhatcode.io;

import java.io.File;
import java.io.IOException;

public class FileIOStream {

	public static void main(String[] args) throws IOException {
		String separator =System.getProperty("file.separator");
		File file = new File("burakduman.txt");
		System.out.println("create status :" +file.createNewFile());
		System.out.println("Path: "+file.getPath());
		System.out.println("can read: "+file.canRead());
		System.out.println("can write: "+file.canWrite());
		System.out.println("Path (Full)"+ file.getAbsolutePath());
		System.out.println("Separator:"+separator);
	}

}
