package Pattern_practice;

class MyThread_1 extends Thread{
    public void run(){
        int i=0;
        while (i<20000){
            System.out.println("My THREAD1 is running!");
            i++;
        }
    }
}
class MyThread_2 extends Thread{
    public void run(){
        int i=0;
        while (i<10000){
            System.out.println("My THREAD2 is running!");
            i++;
        }
    }
}
public class creating_multiple_threads {
    public static void main(String[] args) {
        MyThread_1 t1 = new MyThread_1();
        MyThread_2 t2 = new MyThread_2();
        t1.start();
        t2.start();
    }
}
