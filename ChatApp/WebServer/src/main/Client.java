package main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

public class Client {

  private String name;
  private String host;
  private int port;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public int getPort() {
    return port;
  }

  public void setPort(int port) {
    this.port = port;
  }

  public Client(String name, String host, int port) {
    this.name = name;
    this.host = host;
    this.port = port;
  }

  public void sendMessage(String message, String sender) throws Exception {

    if (!message.equals("")) {
      message = message.trim();
      message = message.replace(" ", "+");
      message = message.replaceAll("\n","+");
      System.out.println("http://" + this.host + ":"+ port + "/" + "?send=" + message + "+from+" + sender);
      URL requestURL = new URL("http://" + this.host + ":"+ port + "/" + "?send=" + message + "+from+" + sender);
      URLConnection conn =  requestURL.openConnection();
      conn.setDoOutput(true);
      conn.connect();
      conn.getOutputStream().write(message.getBytes());
      conn.getOutputStream().flush();
//      InputStream is = conn.getInputStream();
//      InputStreamReader isr = new InputStreamReader(is);
//      BufferedReader br = new BufferedReader(isr);
//      String inputLine;
//      while ((inputLine = br.readLine()) != null) {
//        System.out.println(inputLine);
//      }
//      br.close();
    }
  }
}
