package main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Connection {

  private String url = "";
  private String me;

  public void connect(String command, int port) throws Exception {

    String[] args = command.split(" ");

    String ip = args[1].split(":")[0];
    int serverPort = Integer.parseInt(args[1].split(":")[1]);

    this.url = "http://" + ip + ":" + serverPort + "/message";
    // this.url = new URL(httpsURL);

    String id = args[3];
    this.me = id;
    System.out.println(me);
    this.intReceive(port);
    Thread.sleep(3000);
    message("connect " + id + " " + port);
  }

  public void intReceive(int port) throws Exception {

    MessageObserver observer = new MessageObserver(port);
    Thread thread = new Thread(observer);
    thread.start();
  }

  public void message(String command) throws Exception {
    System.out.println("Message Received");
    if (!command.equals("")) {
      command = command.replace(" ", "+");
      System.out.println(this.url + "?message=" + command + "+" + this.me);
      URL requestURL = new URL(this.url + "?message=" + command + "+" + this.me);
      HttpURLConnection conn = (HttpURLConnection) requestURL.openConnection();
      InputStream is = conn.getInputStream();
      InputStreamReader isr = new InputStreamReader(is);
      BufferedReader br = new BufferedReader(isr);
      String inputLine;
      while ((inputLine = br.readLine()) != null) {
        System.out.println(inputLine);
      }
      br.close();
    }
  }
}
