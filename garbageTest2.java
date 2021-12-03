class garbageTest2{
    public static void main(String args[]){
        int x=20;
        String s="GC";
        System.out.println(x+s);
        s=null;
        garbageTest1 ob=new garbageTest1();
        ob=null;
        // System.gc();
        Runtime.getRuntime().gc();
    }   

    protected void finalize(){
        System.out.println("Garbage Collected.");
    }
}