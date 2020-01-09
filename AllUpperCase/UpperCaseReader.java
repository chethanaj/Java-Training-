import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UpperCaseReader extends FileReader {

    public UpperCaseReader(File file) throws FileNotFoundException {
        super(file);
    }

    @Override
    public int read() throws IOException {
        int val = super.read();

        if (val >= 97 && val <= 122) {
            val -= 32;
        }
        return val;
    }
}
