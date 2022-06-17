package Pattern_practice;
class base{
    public void baseclass(){
        System.out.println("This is base class");
    }
}
class inherit extends base{
    public void singleInheritance(){
        System.out.println("This is an example of single inheritance");
    }
}
class multiple extends inherit{
    public  void multipleInheritance(){
        System.out.println("This is an example of multiple inheritance!");

    }
}
public class singleANDmultilevel_inheritence {
    public static void main(String[] args) {
        base b = new base();
        b.baseclass();
        System.out.println();
        inherit n=new inherit();
        n.singleInheritance();
        n.baseclass();
        System.out.println();

        multiple m=new multiple();
        m.multipleInheritance();
        m.singleInheritance();
        m.baseclass();
    }
}
