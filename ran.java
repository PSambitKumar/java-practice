import java.util.*;
class ran{
    public static void main(String args[]){
        Random r = new Random();


        for(int i=0; i<=6; i++){
            char rc = (char)(r.nextInt(26) + 'a');
            System.out.print(rc);
        }

        // Using ASCII Number:
        int a=r.nextInt(100);  
        // char c=(char)a;  
        System.out.println(a);  
        // System.out.println(c);  

    }
}