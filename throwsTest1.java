import java.io.*;
class throwsTest{
    public void x1()throws IOException{
        throw new IOException("Good Day.");
    }
}

class throwsTest1{
    public static void main(String args[]){
        try{
            throwsTest ob=new throwsTest();
            ob.x1();
        }
        catch(IOException e){
            System.out.println("Thank You.");
        }
    }
}