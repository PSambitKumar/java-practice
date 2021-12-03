class Exception7{
    public void x1(){
        System.out.println("This is PLain Text.");
    }
}

class Exception7 extends Exception8{
    public void x2(){
        System.out.println("This is PLain Text 2.");
    }
}

class main7{
    public static void main(String args[]){
        Exception7 ob=new Exception7();
        ob.x1();
    }
}