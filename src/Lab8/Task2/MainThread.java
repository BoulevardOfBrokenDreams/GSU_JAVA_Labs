package Lab8.Task2;

import Lab8.Task1.MyThread;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread started");

        Thread myThread1 = new Thread(new MyRannable(10, 3, 8, 2));
        Thread myThread2 = new Thread(new MyRannable(20, 4, 19, 5));
        Thread myThread3 = new Thread(new MyRannable(30, 8, 27, 3));


        myThread1.start();
        myThread1.join();
        myThread2.start();
        myThread2.join();
        myThread3.start();
        myThread3.join();

        System.out.println("main thread ends");
    }
}


