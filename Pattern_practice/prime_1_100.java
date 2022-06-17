package Pattern_practice;

import java.util.Scanner;

public class prime_1_100 {

    public static void main(String[] args) {
        System.out.println("To reverse and print the number");
        Scanner p = new Scanner(System.in);
        System.out.print("Enter the lower number\t");
        int low = p.nextInt();
        System.out.print("Enter the higher number\t");
        int high = p.nextInt();
        for (int i = low; i <= high; i++) {
            int count=0;
                for (int div = 2; div * div <= i; div++) {
                    if (i % div == 0) {
                        count++;
                        break;
                    }
                }
            if (count==0){
                System.out.println(i);
            }
    }
}
}
