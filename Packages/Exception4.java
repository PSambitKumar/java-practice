import java.io.*;
class Exception4{
    public static void main(String args[])throws IOException{
        System.out.println("Enter your name: ");
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        String s1=br.readLine();
        System.out.println(s1);
    }
}