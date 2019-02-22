package Threading;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Process implements Runnable{
    int id;

    public Process(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Thread name::"+Thread.currentThread().getName()+" Start :"+id);
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread name::"+Thread.currentThread().getName()+" End :"+id);
    }
}

public class Question9 {
    public static void main(String[] args) {
        System.out.println("Example of new fixed thread pool");
       ExecutorService executorService= Executors.newFixedThreadPool(3);

        for (int i = 0; i <= 30; i++) {
            executorService.submit(new Process(i));
        }
        executorService.shutdown();
    }
}
