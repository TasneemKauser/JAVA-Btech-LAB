package Pattern_practice;
class Base{
    public void baseclass(){
        System.out.println("This is base class");
    }
}
class Inherit extends Base{
    public void singleInheritance(){
        System.out.println("This is an example of single inheritance");
    }
}
class Multiple extends Inherit{
    public  void multipleInheritance(){
        System.out.println("This is an example of multiple inheritance!");
    }
}
class hierarchy extends Base{
    public  void hierarchical(){
        System.out.println("This is an example of an hierarchical inheritance");
    }
}
public class sinle_multilevel_hierarchical_inheritence {
    public static void main(String[] args) {
        Base B= new Base();
        B.baseclass();
        System.out.println();

        Multiple M= new Multiple();
        M.baseclass();
        M.singleInheritance();
        M.multipleInheritance();
        System.out.println();

        hierarchy h=new hierarchy();
        h.baseclass();
        h.hierarchical();
    }
}
