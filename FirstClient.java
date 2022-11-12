
import java.io.*;
import java.net.*;

public class FirstClient {
  public static void main(String[] args) {

   try {
    //create a socket
    Socket clientSocket = new Socket("localhost",6868);

    //Request via DataOutputStream
    DataOutputStream dataStreamOut = new DataOutputStream(clientSocket.getOutputStream());

    //write a message
    dataStreamOut.writeUTF("Happy Coding! APIs");

    //Flushes this output stream and forces any buffered output bytes to be written out. The general contract of flush is that calling it is an indication that, if any bytes previously written have been buffered by the implementation of the output stream, such bytes should immediately be written to their intended destination.

    dataStreamOut.flush();
    
    //close the data stream and client socket

    dataStreamOut.close();
    clientSocket.close();
    
   } catch (Exception e) {
    System.out.println(e);
   }

  }
}
