package Pattern_practice;
class  Animal{
    public void on(){
        System.out.println("Turning on your Phone...");
    }
}
class Dog extends Animal{

    @Override
    public void on(){
        System.out.println("Running on Dog...");
    }
}
public class ques2 {
    public static void main(String[] args) {
        Animal reference=new Dog();
        reference.on();
        Animal sp=new Dog();
        System.out.println("\nMoving to the subclass methods!");  //New reference for subclass!
    }
}
