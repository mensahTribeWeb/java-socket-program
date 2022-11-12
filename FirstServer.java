import java.io.*;
import java.net.*;

public class FirstServer {
  public static void main(String[] args) {
    
    try{ 
      // create a server socket[url + port[id]]
      ServerSocket firstServerSocket = new ServerSocket(6868);

      //establish connection
      Socket socketConnection = firstServerSocket.accept();

      //logic for program to catch the logic
      // This code will allow the program to grab the data being streamed within the socket connection between the client and server. 
      DataInputStream dataStreamIn = new DataInputStream(socketConnection.getInputStream());

      //lets read the data
      String readString = (String)dataStreamIn.readUTF();

      //close the socket connection
      firstServerSocket.close();
   }
   catch(Exception e){
    System.out.println(e);
  }
//END OF SERVER CODE
  }
}
