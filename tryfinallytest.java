class tryfinally{
    public void x1(){
        try{
            System.out.println("try x1");
        }
        catch(Exception e){
            System.out.println("catch x1");
        }
        finally{
            System.out.println("finally x1");
        }
    }

    public void x2(){
        try{
            System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println("catch x2");
        }
        finally{
            System.out.println("finally x2");
        }
    }

    public void x3(){
        try{
            return;
        }
        catch(Exception e){
            System.out.println("catch x3");
        }
        finally{
            System.out.println("finally x3");
        }
    }
}

class tryfinallytest{
    public static void main(String args[]){
        tryfinally ob=new tryfinally();
        ob.x1();
        ob.x2();
        ob.x3();

    }
}