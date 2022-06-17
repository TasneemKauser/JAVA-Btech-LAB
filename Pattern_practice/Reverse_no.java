package Pattern_practice;

import java.util.Scanner;

public class Reverse_no {
    public static void main(String[] args) {

        System.out.println("To reverse and print the number");
        System.out.println("Enter the number to be reversed");
        Scanner r=new Scanner(System.in);
        int n= r.nextInt();
        while (n>0){
            int digit=n%10;
            n=n/10;
            System.out.println(digit);

        }
    }
}
