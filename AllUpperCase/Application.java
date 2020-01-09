import java.io.File;
import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        UpperCaseReader upperCaseReader = new UpperCaseReader(new File("/home/chethana/Documents/Sample.txt"));
        int i;
        while ((i = upperCaseReader.read()) != -1)
            System.out.print((char) i);
        upperCaseReader.close();


    }

}
