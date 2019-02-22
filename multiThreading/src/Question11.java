package Threading;

import java.util.stream.IntStream;

public class Question11 {

    int count;

    public void incrementCount() {
        synchronized (this){
            count++;

        }

    }

    public void worker1() {
        for (int i = 1; i <= 1000; i++) {

            incrementCount();
        }
    }

    public void worker2() {
        for (int i = 1; i <= 1000; i++) {
            incrementCount();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Question11 sync = new Question11();
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
                System.out.println("value of count for thread1 is : "+sync.count);
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(sync.count);
    }
}
