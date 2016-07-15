package messages;

import java.io.*;

public class Messages {
 public static void save(Message[] messages) {
  try (
    FileOutputStream fos = new FileOutputStream("messages.ser");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
  ) {
    oos.writeObject(messages);
  } catch(IOException ioe) {
    System.out.println("Problem saving Messages");
    ioe.printStackTrace();
  }
 }
 public static Message[] load() {
   Message[] messages = new Message[0];
   try (
     FileInputStream fis = new FileInputStream("messages.ser");
     ObjectInputStream ois = new ObjectInputStream(fis);
   ) {
     messages = (Message[]) ois.readObject();
   } catch(IOException ioe) {
     System.out.println("Error reading file");
     ioe.printStackTrace();
   } catch(ClassNotFoundException cnfe) {
     System.out.println("Error loading messages");
   }
   
   return messages;
 }
}