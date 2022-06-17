package Pattern_practice;

class animals{
    void eat(){
        System.out.println("All animals eat!");
    }
}
class lion extends animals{
    void roar(){
        System.out.println("Lion roar!!!");
    }
    void king(){
        System.out.println("Lion is the king of the jungle!");
    }
    void work(){
        super.eat();
        roar();
    }
}
public class super_key_example {
    public static void main(String[] args) {
        System.out.println("Example of the class animal is 'LION'");

        lion l=new lion();
        l.work();
    }
}
