package Threading;

import java.util.stream.IntStream;

public class Question10 {

    int count;

    synchronized public void incrementCount() {
        count++;
    }

    public void worker1() {
        for (int i = 1; i <= 500; i++) {
            incrementCount();
        }
    }

    public void worker2() {
        for (int i = 1; i <= 500; i++) {
            incrementCount();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Question10 sync = new Question10();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                sync.worker1();
                System.out.println("value of count for thread1 is : "+sync.count);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                sync.worker2();
                System.out.println("value of count for thread2 is :"+sync.count);
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("now the thread will rrun one by one and the output is"+sync.count);
    }
}
