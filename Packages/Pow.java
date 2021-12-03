package arithmatic.java;

class Sum{
   void sum(int x, int y){
        int add=x+y;
        System.out.println("Sum is: "+add+".");
    }
}

class Sub extends Sum{
    void sub(int x, int y){
        int subs=x-y;
        System.out.println("Substraction is: "+subs +".");
    }
}

class Mul extends Sub{
    void mul(int x, int y){
        int mult=x*y;
        System.out.println("Multiplication is: "+mult +".");
    }
}

public class Pow{
    void pow(int x, int y){
        int powe=x**y;
        System.out.ptintln("Power is: "+powe+"+");
    }
}