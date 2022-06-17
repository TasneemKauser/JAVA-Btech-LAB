package Pattern_practice;
import java.util.*;
public class Pattern2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int data=scn.nextInt() ;

        int i=0;
        int j=n-1;
        while (i<n&&j>=0){
            if (arr[i][j]==data){
                System.out.println(i);
                System.out.println(j);
                return;
            }
            else if (data<arr[i][j]){
                j--;
            }
            else if (data>arr[i][j]){
                i++;
            }
        }
        System.out.println("Not found");
    }
}

