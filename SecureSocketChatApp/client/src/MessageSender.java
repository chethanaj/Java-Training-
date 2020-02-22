import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class MessageSender extends Thread {

    Scanner scn;
    DataOutputStream dos;

    public MessageSender(Scanner scn, DataOutputStream dos) {
        this.scn = scn;
        this.dos = dos;
    }

    @Override
    public void run() {
        while (true) {

            // read the message to deliver.
            String msg = scn.nextLine();

            try {
                // write on the output stream
                dos.writeUTF(msg);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
