package serhatcode.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Read {

    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("myCode.txt");


            int deger;
            String s = "";
            while ((deger = fis.read()) != -1) {
                // her karakter okunacak ve deger e atanacak ve bittiginde -1 (false)dongu duracak
                s += (char) deger;
            }
            System.out.println("Dosya icerigi: " + s);


        } catch (FileNotFoundException e) {
            System.out.println("Dosya okunurken hata olustu...");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {

                    fis.close();
                }

            } catch (IOException e) {
                System.out.println("Dosya kapatilirken bir hata olustu");
            }
        }

    }

}

