package Pattern_practice;

class MyThread1 extends Thread{
    @Override
    public  void run(){
        int i=0;
        while (i<20000){
            System.out.println("My thread1 is running!");
            System.out.println("I am happy!");
            i++;
        }
    }
}

class MyThreadRunnable1 implements Runnable {
    public void run() {
        System.out.println("Thread is running");
    }
    public static class ways_of_creating_threads {
        public static void main(String[] args) {
            MyThread1 t1 = new MyThread1();

            Runnable r1 = new MyThreadRunnable1();
            Thread t2 = new Thread(r1, "My new thread");
            t1.start();
            t2.start();
            String str = t2.getName();
            System.out.println(str);


        }
    }
}
