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

    //���� 1�: ���������� �������� ��������

    ServerSocket connectionSocket = new ServerSocket(PORT);
    System.out.println("Server started");
    while (true)
    {
        //������� ��� ������� ��������

	    InputStreamReader r=new InputStreamReader(System.in); 
            BufferedReader br=new BufferedReader(r); 
            System.out.println("Enter ur name");  
            String name=br.readLine(); 
            System.out.println("Welcome "+name);  


        //���� 2: ������� ��� ������� ������� �������� ��� ������
    Socket dataSocket = connectionSocket.accept();
    connectionCount++;
    System.out.println("Received " + connectionCount + " request from " + connectionSocket);
   
    //���� 3�: ���������� �������� ������������ ��������� ��� �������� dataSocket
    InputStream is = dataSocket.getInputStream();
    BufferedReader in = new BufferedReader (new InputStreamReader(is));
   
    //���� 4�: ���������� �������� ����������� ��������� ��� �������� dataSocket
    OutputStream os = dataSocket.getOutputStream();
    PrintWriter out = new PrintWriter (os, true);
   
    //���� 5�: �������� ��������� ��' ��� ������
    String line = in.readLine();
    System.out.println("Received message from Client: " + line);
   
    //���� 6�: ������� ������������� ��������� ���� ������
    out.println("Esteila MHNYMA");
    System.out.println("Message sent: Esteila MHNYMA");
   
    //���� 7�: �������� ��� �������� ������
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
	
	    //���� 1�: ���������� �������� ��������
	
	    ServerSocket connectionSocket = new ServerSocket(PORT);
	    System.out.println("Server started");
	    while (true)
	    {
	        //������� ��� ������� ��������
	
		    InputStreamReader r=new InputStreamReader(System.in); 
	            BufferedReader br=new BufferedReader(r); 
	            System.out.println("Enter ur name");  
	            String name=br.readLine(); 
	            System.out.println("Welcome "+name);  
	
	
	        //���� 2: ������� ��� ������� ������� �������� ��� ������
		    Socket dataSocket = connectionSocket.accept();
		    connectionCount++;
		    System.out.println("Received " + connectionCount + " request from " + connectionSocket);
		   
		    //���� 3�: ���������� �������� ������������ ��������� ��� �������� dataSocket
		    InputStream is = dataSocket.getInputStream();
		    BufferedReader in = new BufferedReader (new InputStreamReader(is));
		   
		    //���� 4�: ���������� �������� ����������� ��������� ��� �������� dataSocket
		    OutputStream os = dataSocket.getOutputStream();
		    PrintWriter out = new PrintWriter (os, true);
		   
		    //���� 5�: �������� ��������� ��' ��� ������
		    String line = in.readLine();
		    System.out.println("Received message from Client: " + line);
		   
		    //���� 6�: ������� ������������� ��������� ���� ������
		    out.println("Esteila MHNYMA");
		    System.out.println("Message sent: Esteila MHNYMA");
		   
		    //���� 7�: �������� ��� �������� ������
		    dataSocket.close();
		    System.out.println("Data socket closed");
	       
	    }
	       
	}
>>>>>>> refs/heads/develop
}