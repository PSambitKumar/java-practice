import java.io.*;  
import java.net.*;  
import java.util.*; 
public class sock2 {  
public static void main(String[] args) {  
try{      
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
Socket s=new Socket("localhost",6666);  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
dout.writeUTF(s);  
dout.flush();  
dout.close();  
s.close();  
}catch(Exception e){System.out.println(e);}  
}  
}  