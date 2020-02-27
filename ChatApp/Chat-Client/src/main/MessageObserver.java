package main;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.URI;

public class MessageObserver implements Runnable {

    private int port;

    public MessageObserver(int port) {
        this.port = port;
    }

    public void run() {
        try {
            System.out.println("LOCAL SERVER STARTED");
            InetSocketAddress address = new InetSocketAddress(port);

            HttpServer httpsServer = HttpServer.create(address, 0);

            httpsServer.createContext("/send", new send());
            httpsServer.start();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static class send implements HttpHandler {
        @Override
        public void handle(HttpExchange he) throws IOException {

            try {
                // parse request
                URI requestedUri = he.getRequestURI();
                String command = requestedUri.getRawQuery().replace("+", " ").split("=")[1];
                System.out.println(command);
                he.sendResponseHeaders(200, "Command Received".length());
                OutputStream os = he.getResponseBody();
                os.write("Command Received".toString().getBytes());
                os.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
