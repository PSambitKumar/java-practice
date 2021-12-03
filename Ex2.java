class Ex1{
    public static void x1(){
        System.out.println("CSM Technologies.");
    }
}

class ex3{
    public void x2(){
        x1();
        Ex1 ob2=new Ex1();
        ob2.x1();
        Ex1.x1();
    }
}

class Ex2{
        public static void main(String args[]){
        Ex1 ob=new Ex1();
        ob.x1(); //Call static method by creating object
        Ex1.x1(); //Call static method by class name
        ob2.x2();

    }
}