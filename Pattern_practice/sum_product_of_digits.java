package Pattern_practice;

import java.util.Scanner;

public class sum_product_of_digits {
    public static void main(String[] args) {
        System.out.println("Enter the number for the sum and product of their digits");
        Scanner sp=new Scanner(System.in);
        int n= sp.nextInt();
        int sum=0;
        int pro=1;
        int nod=0;
        int temp=n;
        while (temp!=0){
            temp=temp/10;
            nod++;
        }
        int div=(int)Math.pow(10,n-1);
        while (div!=0){
            int q=n/div;
            sum+=sum+q;
            n=n/div;
            div=div/10;
        }
        System.out.println(sum);
    }
}
