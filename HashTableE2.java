import java.util.*;
public class HashTableE2 {
public static void main(String args[]) {
 
// Hashtable<Integer, String> h = new Hashtable<Integer, String>();
Hashtable h = new Hashtable();
      h.put(1, "One");
      h.put(2, "Two");
      h.put(3, "Three");
Set<Integer> keys = h.keySet();
        for(Integer key: keys){
            System.out.println(key + " " +h.get(key));
        }
}
}