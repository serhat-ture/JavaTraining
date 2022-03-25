package serhatcode.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Mycopy {


    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;
        try {
            // create a fileoutputstream object
            fos = new FileOutputStream("myCode.txt",true); // append
            byte[] array= {104,105,126};
            fos.write(array);
            String s = "my name is Serhat";
            fos.write(s.getBytes());
            //  getBytes() method used converts a string into bytes array.
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            fos.close();
        }
        System.out.println("Finish");
    }
}
