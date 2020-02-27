package main;

import java.util.Scanner;

public class ChatClient {

  public static Connection connection;
  public static boolean connected = false;

  public static void main(String[] args) throws Exception {

    connection = new Connection();
    Scanner input = new Scanner(System.in);

    while (true) {
      if (connected) {
        System.out.println("Ready to Message :");
        String message = input.nextLine();
        connection.message(message);
      } else {
        System.out.println("Enter Command to Connect");
        String command = input.nextLine();

        System.out.println(command);

        connection.connect(command, 3030);
        connected = true;
        Thread.sleep(1000);
      }
    }
  }

}
