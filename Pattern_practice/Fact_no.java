package Pattern_practice;

import java.util.Scanner;

public class Fact_no {
    public static void main(String[] args) {
        System.out.println("To print factorial of a given number.");
        System.out.println("Enter the value of n");
        Scanner f=new Scanner(System.in);
        int n = f.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}