package main;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpsConfigurator;
import com.sun.net.httpserver.HttpsParameters;
import com.sun.net.httpserver.HttpsServer;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.URI;
import java.security.KeyStore;
import java.util.ArrayList;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.TrustManagerFactory;

public class ChatServer {

  public static void main(String[] args) throws Exception {

     try {
      InetSocketAddress address = new InetSocketAddress(8282);

       HttpServer httpsServer = HttpServer.create(address, 0);

      httpsServer.createContext("/message", new message());
      httpsServer.start();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public static class message implements HttpHandler {

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
      try {
        // parse request
        URI requestedUri = httpExchange.getRequestURI();
        String command = requestedUri.getRawQuery().replace("+", " ").split("=")[1];
        System.out.println(command);
        String origin = httpExchange.getRemoteAddress().getAddress().toString().split("/")[1];
        System.out.println(origin);

        ChatService s = new ChatService(command,
            httpExchange.getRemoteAddress().getAddress().toString().split("/")[1]);
        Thread t = new Thread(s);
        t.start();

        httpExchange.sendResponseHeaders(200, "Acknowledged".length());
        OutputStream os = httpExchange.getResponseBody();
        os.write("Acknowledged".getBytes());
        os.close();

      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
