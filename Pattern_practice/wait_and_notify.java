package Pattern_practice;
class wait_notify{
    boolean m1=false;
    public void m1(){
        System.out.println("This is the example of wait method");
        notify();
    }
    public void m2(){
        while (!m1){
            try {
                System.out.println("Wait method started");
                wait();
                System.out.println("Wait method stopped for a while and then again started");
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
public class wait_and_notify {

    public static void main(String[] args) {
        wait_and_notify obj=new wait_and_notify();
        Thread m=new Thread(){
            public void run(){

            }
        };
        m.start();

    }
}
