package Threading;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Question12 {

    AtomicInteger count= new AtomicInteger();

    public void incrementCount() {
        synchronized (this) {
            count.incrementAndGet();
        }
    }

    public void worker1() {
        for (int i = 1; i <= 1000; i++) {
            count.incrementAndGet();
        }
    }

    public void worker2() {
        for (int i = 1; i <= 1000; i++) {
            count.incrementAndGet();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("example of atomic class");
        Question12 atomic = new Question12();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                atomic.worker1();
                System.out.println("value of count for thread1 is : "+atomic.count);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                atomic.worker2();
                System.out.println("value of count for thread1 is : "+atomic.count);
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(atomic.count);
    }

}
