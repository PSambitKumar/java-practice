import java.text.SimpleDateFormat;
import java.util.*;
class Date1{
        public static void main(String args[]){
        Date d = new Date();
        System.out.println(d);

        StringTokenizer st = new StringTokenizer(d.toString());
        // String s1 = st.nextToken();
        // System.out.print(s1);

        for(int i=0; i<=4; i++){
            String s1 = st.nextToken();
            if(i==3){
                System.out.print(s1);
            }
        }
        SimpleDateFormat st = new SimpleDateFormat("dd.MM.yyyy");
        System.out.print(st.format(dNow));

        SimpleDateFormat st1 = new SimpleDateFormat("E yyyy.mm.dd 'at' hh:mm:ss a zzz");
        System.out.print("Current Date: " + st1.format(dNow));
    }   
}