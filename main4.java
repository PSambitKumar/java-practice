interface i1{
    int coffee=100;
}

interface i2{
    int cream=50;
}

interface i3{
    int ice=40;
}

class total implements i1,i2,i3{
    public void total1(){
        int total=coffee+cream+ice;
        System.out.println("total: "+total);
    }
}
class main4{
    public static void main(String args[]){
        total ob=new total();
        ob.total1();
    }
}