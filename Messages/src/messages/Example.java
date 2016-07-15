package messages;
import java.util.Arrays;
import java.util.Date;

import messages.Message;
import messages.Messages;

public class Example {
  
  public static void main(String[] args) {
    Message message = new Message(
      "johnpromano",
      "Welcome to the world!",
      new Date(450943047000L)
    );
    Message secondMessage = new Message(
      "awaclawek",
      "woo woo",
      new Date()
    );
    System.out.printf("This is a new Msg: %s %n", message);
    System.out.println("The words are:");
    for (String word: message.getWords()) {
      System.out.println(word);
    }
    
    Message [] messages = {secondMessage, message};
    Arrays.sort(messages);
    for (Message exampleMessage : messages) {
      System.out.println(exampleMessage);
    }
    Messages.save(messages);
    Message[] reloadedMessages = Messages.load();
    for (Message reloaded : reloadedMessages) {
      System.out.println(reloaded);
    }
  }
}