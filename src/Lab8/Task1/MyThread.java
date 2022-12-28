package Lab8.Task1;

public class MyThread extends Thread{

    private int var;

    public MyThread(int var) {
        this.var = var;
    }

    @Override
    public void run(){
        System.out.println("Thread " + var + " started");

        if(var == 1){
            MyThread thread = new MyThread(4);
            thread.start();
        }

        System.out.println("Thread " + var + " ends");
    }
}
