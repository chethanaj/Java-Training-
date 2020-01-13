package Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadStream {
    public static void main(String[] args) {
        try {
            File initialFile = new File("/media/chethana/MyDisk/Java training/Java-Training-/File operation/src/Stream/Sample.txt");
            FileInputStream fileInputStream = new FileInputStream(initialFile);
            int i=fileInputStream.read();
            while (i!= -1) {
                System.out.print((char) i);
                i=fileInputStream.read();
            }

        }catch (IOException e){
          e.printStackTrace();
        }
    }
}
