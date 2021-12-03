import java.io.*;
class A{
    public void x1()throws IOException{
        System.out.println("1");
    }
}

class B extends A{
    public void x1()throws IOException{
        System.out.println("2");
    }
}

class MoreException{
    public static void main(String args[]){
        try{
            B ob=new B();
            ob.x1();
        }
        catch(Exception e){
            
        }
    }
}