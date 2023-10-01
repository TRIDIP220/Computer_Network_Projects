import java.io.*;
import java.net.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class Server{


public static void main(String[] args) throws Exception{


try{


ServerSocket serversocket = new ServerSocket(6000);

boolean flag = true;

while(true){


Socket connectionsocket = serversocket.accept();

DataInputStream streamIn = new DataInputStream(new BufferedInputStream(connectionsocket.getInputStream()));
DataOutputStream streamOut = new DataOutputStream(connectionsocket.getOutputStream());

System.out.println("Connected with client");

Date date = Calendar.getInstance().getTime();

DateFormat dateformat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");

String str = dateformat.format(date);

System.out.println("Connected to server port 6000");
System.out.println("Current date " +str);



}//while
}//try

catch(Exception e){

System.out.println("Error");



}//catch
}// Exception

}// Server
