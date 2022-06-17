package Pattern_practice;

import java.util.Scanner;

class product{
    private String pro_name;private int pro_id;

    public void set(String n,int p_id){
        pro_name=n;pro_id=p_id;

    }
    public void display(){
        System.out.println("The product name is "+ pro_name+"\nThe product id is "+pro_id);
    }
}
public class Array_of_Objects {
    public static void main(String[] args) {
        System.out.println("Enter the total number of products in array");
        Scanner S=new Scanner(System.in);
        product[] p=new product[5];
        for (int j=0;j<5;j++) {
            System.out.println("Product "+(j+1));
            System.out.println("Enter the products name");
            String pro=S.next();
            System.out.println("Enter the id name");
            int i=S.nextInt();
            p[i]=new product();
//            p[i].set(pr);
        }
        for (int i=0;i<5;i++){
            p[i].display();
        }
    }
}
