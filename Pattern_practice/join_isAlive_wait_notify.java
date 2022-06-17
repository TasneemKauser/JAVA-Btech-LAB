package Pattern_practice;
class Join1 extends Thread{
    public  void run(){
        for (int i=0;i<=5;i++){
            System.out.println(i);
        }
    }
}
public class join_isAlive_wait_notify {
    public static void main(String[] args) {
        Join1 j=new Join1();
        Join1 j1=new Join1();
        j.start();
        try {
            j.join(200);

        }
        catch (Exception e){
            System.out.println(e);
        }
        j1.start();
        System.out.println(j1.isAlive());

    }
}
