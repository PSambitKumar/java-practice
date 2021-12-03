import java.util.Scanner;
 
public class Next
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter value for str1");
        
        String str1=sc.next();
        
        System.out.println("str1 is "+str1);
        
        System.out.println("Enter value for str2");
        
        String str2=sc.next();
        
        System.out.println("str2 is "+str2);
        
        sc.close();
    }
}