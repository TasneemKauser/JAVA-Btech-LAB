package Pattern_practice;
class smartphone{
    public void on(){
        System.out.println("Turning on your Phone...");

    }
}
class vivo_Smartphone extends smartphone{

    public void greet(){
        System.out.println("Heya!!! Wake up dear.");
    }
    @Override
    public void on() {

        super.on();
    }
}
public class DYnamic_method_dispatch {
    public static void main(String[] args) {
        smartphone s;
        s= new vivo_Smartphone();
        s.on();
//        s.greet();                          //Gives error as it is overrides class from super class and need to
                                            //call the subclass method differently to run the method!!!

        vivo_Smartphone v=new vivo_Smartphone();
        v.greet();
        v.on();
    }
}

