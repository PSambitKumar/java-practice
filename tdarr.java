import java.util.*;

class tdarr {
    public static void main(String[] args) {
        int[][] arr = new int[4][5];
        for(int i=0; i<4; i++){
          for(int j=0; j<5; j++){
                System.out.println("Enter Data at position " + i + j + ":");
                Scanner sc=new Scanner(System.in);
                int x=sc.nextInt();
                arr[i][j]=x;
            }
        }

        for(int i=0; i<4; i++){
            for(int j=0; j<5; j++){
                  System.out.print(arr[i][j] + " | ");
              }
            System.out.println("");
          }
    }
}