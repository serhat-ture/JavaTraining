package serhatcode.exception;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExampleFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			findFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Finish");
	}
	
	public static void findFile() throws IOException{
		File newFile = new File("test.txt");
		FileInputStream stream = new FileInputStream(newFile);
		
	}

}
