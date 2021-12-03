import java.util.Scanner;

public class Bitwise {
    public static  void main(String[] args){
        int age;
        int a = 4;
        int b = 5;

        System.out.println("Bitwise & "+ a +" and "+b + " is :" +(a&b));
        System.out.println("Bitwise | "+ a +" and "+b + " is :" +(a|b));

        System.out.println('a'+10);
        System.out.println('A'+10);
        double d = 12.345;
        int i = 3;

        try{
            System.out.println(100/0);
        }
        catch (Exception e){
            System.out.println(e);
        }
        try {
            System.out.println(-0/0);
        }
        catch (Exception e1){
            System.out.println(e1);
        }
        try{
            System.out.println(12/-3.2);
        }
        catch (Exception e2){
            System.out.println(e2);
        }
        try{
            System.out.println(i/d);
        }
        catch (Exception e4){
            System.out.println(e4);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = sc.nextInt();

        String res = (age<62 && age>18 ? "Yes you are eligible for VOTING." : "No you are not Eligible for VOTING." );
        System.out.println(res);



    }
}
