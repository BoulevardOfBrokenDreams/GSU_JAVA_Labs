package Lab8.Task2;

import java.util.Random;
import java.util.Scanner;

public class MyRannable implements Runnable {

    private final int arrCount;
    private final int firstIndex;
    private final int lastIndex;
    private final int p;

    public MyRannable(int arrCount, int firstIndex, int lastIndex, int p) {
        this.arrCount = arrCount;
        this.firstIndex = firstIndex;
        this.lastIndex = lastIndex;
        this.p = p;
    }

    @Override
    public void run(){
        System.out.println("Thread " + arrCount / 10 + " started");

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        var arr = new int[arrCount];
        for(int i = 0; i < arrCount; i++){
            arr[i] = random.nextInt(1, 100);
        }

        var mul = 1;
        for(int i = firstIndex; i < lastIndex; i++){
            mul *= arr[i];
        }
        System.out.println(mul % p == 0);

        System.out.println("Thread " + arrCount / 10 + " ends");

        if(arrCount / 10 == 1){
            Thread thread = new Thread(new MyRannable(40, 12, 35, 4));
            thread.start();
        }
    }
}
