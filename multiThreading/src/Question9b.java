

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Process2 implements Runnable{
    int id;


    public Process2(int id) {
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

public class Question9b {
    public static void main(String[] args) {
        System.out.println("Example of cached thread pool");

           ExecutorService executorService= Executors.newCachedThreadPool();
        for (int i = 0; i <= 30; i++) {
            executorService.submit(new Process2(i));
        }
        executorService.shutdown();
    }
}
