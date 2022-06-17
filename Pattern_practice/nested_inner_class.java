package Pattern_practice;
class Outer_Demo {
    // inner class
    private class Inner_Demo {
        public void print() {
            System.out.println("This is a nested inner class");
        }
    }
    // Accessing the inner class from the method within
    void display_Inner() {
        Inner_Demo inner = new Inner_Demo();
        inner.print();
    }
}
public class nested_inner_class {
    public static void main(String args[]) {
        // Instantiating the outer class
        Outer_Demo outer = new Outer_Demo();

        // Accessing the display_Inner() method.
        outer.display_Inner();
    }
}