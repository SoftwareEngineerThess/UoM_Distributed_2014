<<<<<<< HEAD
import java.net.ServerSocket;
import java.net.Socket;
import java.net.*;
import java.io.*;

public class ClientServer {
private static final int PORT = 1234;
public static void main (String args[]) throws IOException
{
    int connectionCount = 0;

    //Βήμα 1ο: Δημιουργία υποδοχής ρεύματος

    ServerSocket connectionSocket = new ServerSocket(PORT);
    System.out.println("Server started");
    while (true)
    {
        //Αναμονή για Πελάτες Σύνδεσης

	    InputStreamReader r=new InputStreamReader(System.in); 
            BufferedReader br=new BufferedReader(r); 
            System.out.println("Enter ur name");  
            String name=br.readLine(); 
            System.out.println("Welcome "+name);  


        //Βήμα 2: Αναμονή και αποδοχή αίτησης σύνδεσης από πελάτη
    Socket dataSocket = connectionSocket.accept();
    connectionCount++;
    System.out.println("Received " + connectionCount + " request from " + connectionSocket);
   
    //Βήμα 3ο: Δημιουργία ρεύματος εισερχόμενων δεδομένων της υποδοχής dataSocket
    InputStream is = dataSocket.getInputStream();
    BufferedReader in = new BufferedReader (new InputStreamReader(is));
   
    //Βήμα 4ο: Δημιουργία ρεύματος εξερχόμενων δεδομένων της υποδοχής dataSocket
    OutputStream os = dataSocket.getOutputStream();
    PrintWriter out = new PrintWriter (os, true);
   
    //Βήμα 5ο: Ανάγνωση μηνύματος απ' τον πελάτη
    String line = in.readLine();
    System.out.println("Received message from Client: " + line);
   
    //Βήμα 6ο: Εγγραφή συγκεκριμένου μηνύματος στον πελάτη
    out.println("Esteila MHNYMA");
    System.out.println("Message sent: Esteila MHNYMA");
   
    //Βήμα 7ο: Κλείσιμο της σύνδεσης πελάτη
    dataSocket.close();
    System.out.println("Data socket closed");
       
    }
       
    }
=======
import java.net.ServerSocket;
import java.net.Socket;
import java.net.*;
import java.io.*;

public class ClientServer {
	private static final int PORT = 1234;
	public static void Main (String args[]) throws IOException
	{
	    int connectionCount = 0;
	
	    //Βήμα 1ο: Δημιουργία υποδοχής ρεύματος
	
	    ServerSocket connectionSocket = new ServerSocket(PORT);
	    System.out.println("Server started");
	    while (true)
	    {
	        //Αναμονή για Πελάτες Σύνδεσης
	
		    InputStreamReader r=new InputStreamReader(System.in); 
	            BufferedReader br=new BufferedReader(r); 
	            System.out.println("Enter ur name");  
	            String name=br.readLine(); 
	            System.out.println("Welcome "+name);  
	
	
	        //Βήμα 2: Αναμονή και αποδοχή αίτησης σύνδεσης από πελάτη
		    Socket dataSocket = connectionSocket.accept();
		    connectionCount++;
		    System.out.println("Received " + connectionCount + " request from " + connectionSocket);
		   
		    //Βήμα 3ο: Δημιουργία ρεύματος εισερχόμενων δεδομένων της υποδοχής dataSocket
		    InputStream is = dataSocket.getInputStream();
		    BufferedReader in = new BufferedReader (new InputStreamReader(is));
		   
		    //Βήμα 4ο: Δημιουργία ρεύματος εξερχόμενων δεδομένων της υποδοχής dataSocket
		    OutputStream os = dataSocket.getOutputStream();
		    PrintWriter out = new PrintWriter (os, true);
		   
		    //Βήμα 5ο: Ανάγνωση μηνύματος απ' τον πελάτη
		    String line = in.readLine();
		    System.out.println("Received message from Client: " + line);
		   
		    //Βήμα 6ο: Εγγραφή συγκεκριμένου μηνύματος στον πελάτη
		    out.println("Esteila MHNYMA");
		    System.out.println("Message sent: Esteila MHNYMA");
		   
		    //Βήμα 7ο: Κλείσιμο της σύνδεσης πελάτη
		    dataSocket.close();
		    System.out.println("Data socket closed");
	       
	    }
	       
	}
>>>>>>> refs/heads/develop
}