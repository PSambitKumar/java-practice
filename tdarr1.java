import java.nio.channels.FileChannel.MapMode;
import java.util.*;

class tdarr1 {
    public static void main(String[] args) {
        int[][] arr = new int[4][];
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];
        arr[3] = new int[4];
        // System.out.println(arr.length);
        for(int i=0; i<arr.length; i++){
          for(int j=0; j<arr[i].length; j++){
                System.out.println("Enter Data at position " + i + j + ":");
                Scanner sc=new Scanner(System.in);
                int x=sc.nextInt();
                arr[i][j]=x;
            }
        }

        System.out.println("Your 2D array list is bellow: ");

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){ 
                  System.out.print(arr[i][j] + " | ");
              }
            System.out.println("");
          }
    }
}