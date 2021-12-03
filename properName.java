import java.io.*;  
public class properName{    
public static void main(String args[])throws Exception{                 
     InputStreamReader r=new InputStreamReader(System.in);    
    BufferedReader br=new BufferedReader(r);      
    System.out.println("Enter Your Name: ");    
    String dta=br.readLine();  
      
    // System.out.println("You Entered: "+dta);    
    char[] ch=dta.toCharArray();
    char[] ch1=ch.toLowerCase();
        for(int i=0; i<ch1.length; i++){
            System.out.println(ch1[i]);       
        }
    }
}