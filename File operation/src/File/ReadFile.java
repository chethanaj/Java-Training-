package File;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        ReadFile r=new ReadFile();
        String fileLocation = "/media/chethana/MyDisk/Java training/Java-Training-/File operation/src/File/Sample.txt";
        r.reader(fileLocation);

    }

    void reader(String fileLocation) throws IOException {

        try {
            FileReader fileReader = new FileReader(fileLocation);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            int i;
            while ((i=bufferedReader.read())!=-1){
                System.out.print((char)i);
            }
        }catch (FileNotFoundException e){

            File file = new File(fileLocation);
            file.createNewFile();
            reader(fileLocation);

        }catch (IOException e2){
            throw e2;
        }
    }
}
