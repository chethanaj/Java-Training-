package main;

import java.util.Map;

public class ChatService implements Runnable{

  String message;
  String host;
  int port;
  Client sourceClient;

  public ChatService(String message, String host) {
    this.message = message;
    this.host = host;

    String command = this.message.split(" ")[0];
    System.out.println("COMMAND = " + command);
    if(!command.equals("connect")){
      String sender = message.split(" ")[message.split(" ").length -1].trim();
      this.sourceClient = ClientRegister.clientMap.get(sender);
    }
  }

  public void run() {

    System.out.println("Service Thread started");
    String[] strings = message.split(" ");

    if(strings[0].equals("connect")){
      this.connect(strings);
    }
    if (strings[0].equals("send")){
      this.send(message);
    }
    if (strings[0].equals("list")){
      this.list(strings);
    }
  }

  public void list(String[] strings){

    Map<String, Client> clientMap = ClientRegister.clientMap;
    String list = "";
    for (String name : clientMap.keySet()) {
        list = list + name + "-";
    }

    System.out.println("Messaging Initiated");

    try {
      sourceClient.sendMessage(list, strings[1]);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public void connect(String[] params){
    try {
      String name = params[1];
      int port = Integer.parseInt(params[2]);
      Client c = new Client(name, this.host, port);
      ClientRegister.clientMap.put(name, c);
    }
    catch (Exception e){
      System.out.println(e.getMessage());
    }
  }

  public void send(String message){

    //Send the message to the client
    try {
      System.out.println("Messaging Initiated");
      String receiver = message.split("-")[1].trim().split(" ")[0];
      System.out.println(receiver);
      System.out.println(message.substring(message.indexOf(" ") + 1));
      System.out.println(sourceClient);
      Client destination = ClientRegister.clientMap.get(receiver);
      destination.sendMessage(message.split("-")[0].trim().replaceFirst("send","") , sourceClient.getName());
    }catch (Exception e)
    {
      e.printStackTrace();
    }
  }
}
