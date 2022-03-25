package serhatcode.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class BufferedReaderWriter {

        public static void main(String[] args) {
            String[] list = {"one", "two", "three", "fo"};
            try {
                File file = new File("file.txt");
                FileWriter fileReader = new FileWriter(file); // A stream that connects to the text file
                BufferedWriter bufferedWriter = new BufferedWriter(fileReader); // Connect the FileWriter to the BufferedWriter

                for (String s : list) {
                    bufferedWriter.write(s + "\n");
                }

                bufferedWriter.close (); // Close the stream
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

