package Pattern_practice;

public class method_overriding_example {
    static  void foo(){
        System.out.println("GOOD MORNING GIRL!");
    }
    static  void foo(int a,int b){
        System.out.println("GOOD MORNING " +a+ " GIRL!");
        System.out.println("GOOD MORNING " +b+ " GIRL!");
    }
    public static void main(String[] args) {
//METHOD OVERLOADING:
        foo();
        foo(200,12); //Arguments are actual values.
    }
}
