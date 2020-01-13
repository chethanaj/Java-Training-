package File;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void main(String[] args) {

        try
        {
            FileWriter fileWriter = new FileWriter("/media/chethana/MyDisk/Java training/Java-Training-/File operation/src/File/Sample.txt");
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            for (int i = 0; i <10 ; i++) {
                bufferedWriter.write("Line "+i);
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
        }catch (IOException e){
          e.printStackTrace();
        }

    }
    }

