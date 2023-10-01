import java.io.*;
import java.net.*;


public class Client{


public static void main(String[] args) throws Exception{


Socket client = new Socket("127.0.0.1",6000);

DataInputStream streamIn = new DataInputStream(new BufferedInputStream(client.getInputStream()));


DataOutputStream streamOut = new DataOutputStream(client.getOutputStream());



System.out.println(streamIn.readUTF());

System.out.println(streamIn.readUTF());
client.close();



}// exception



}//client