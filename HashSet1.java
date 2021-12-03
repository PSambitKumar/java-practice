import java.util.*;  
class HashSet1{  
 public static void main(String args[]){  
    HashSet set=new HashSet();  
           set.add("One");    
           set.add("Two");    
           set.add("Three");   
           set.add("Four");  
           set.add("Four");
           set.add("Five");
           set.add(1);
           set.add(12.65);
           set.add(null);

           for (Object o :set)
               System.out.println(o);
 }  
}