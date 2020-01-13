package Stream;

import java.io.*;

public class WriteStream {
    public static void main(String[] args) {

        try{
            FileOutputStream fileOutputStream=new FileOutputStream("/media/chethana/MyDisk/Java training/Java-Training-/File operation/src/Stream/Sample.txt");
            for (int i = 65; i < 91; i++) {
                fileOutputStream.write(i);
            }
            fileOutputStream.close();

        }catch(IOException e){
            System.out.println(e);}
    }
}
