import java.util.*;
class ALTest{
    public static void main(String args[]){
        ArrayList al=new ArrayList();
        System.out.println(al);//call al.toString();
        System.out.println(al.size());
        al.add(10);
        al.add("Sambit");
        al.add(27.05);
        System.out.println(al);//call al.toString();
        al.remove(10);
        System.out.println(al.get(1));

    }
}