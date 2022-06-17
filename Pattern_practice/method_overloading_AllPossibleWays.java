package Pattern_practice;

class Adder{
    static int add(int a, int b){
        return a+b;
    }
    static double add(double a, double b,double c){
        return a+b+c;
    }
    void sum (int a, long b){
        System.out.println(a+b);
    }
}
public class method_overloading_AllPossibleWays {
    public static void main(String[] args) {
        System.out.println("Overloading type 1: Changing number of arguments");
        System.out.println(Adder.add(34,2));

        System.out.println("Overloading type 2: Changing data types of arguments");
        System.out.println(Adder.add(11.45,23.231,1.45));

        System.out.println("Overloading type 3: Overloading with type promotion");
        Adder obj=new Adder();
        obj.sum(12,442313);
    }
}
