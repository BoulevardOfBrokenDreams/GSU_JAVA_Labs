package Lab8.Task1;
public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread started");

        MyThread myThread1 = new MyThread(1);
        MyThread myThread2 = new MyThread(2);
        MyThread myThread3 = new MyThread(3);
        myThread1.start();
        myThread1.join();
        myThread2.start();
        myThread2.join();
        myThread3.start();
        myThread3.join();

        System.out.println("main thread ends");
    }
}


