package serhatcode.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ExampleCopyFile {
    private static final ArrayList<Integer> content
            = new ArrayList<Integer>();

    public static void main(String[] args) {
        read("winamp-jingle.mp3");

        copy("winamp-jingle2.mp3");

		/*File file= new File("winamp-jingle2.mp3");
		file.delete();*/

    }

    public static void read(String path) {
        try {
            FileInputStream fis = new FileInputStream(path);
            int readFile;
            while ((readFile = fis.read()) != -1) {
                content.add(readFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //winamp-jingle.mp3
    public static void copy(String path) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(path);

            for (int value : content) {
                fos.write(value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}

