package Pattern_practice;

class calculator{
     static int powerInt(int num1,int num2){
      return (int) Math.pow(num1,num2);
    }
     static double powerDouble(double num1,int num2){
        return (int) Math.pow(num1,num2);
    }
    public void power(int num1,int num2){
        int x= (int) Math.pow(num1,num2);
        System.out.println(x);
    }
}
public class assignment_02 {
    public static void main(String[] args) {
        int x;
        System.out.println(calculator.powerInt(3,5));
        System.out.println(calculator.powerDouble(7,2));
        calculator c=new calculator();
        c.power(2,2);
    }

}

