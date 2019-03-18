

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Question_7 {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(()->{
            try {
                Thread.sleep(1000L);
                System.out.println("Thread 1 Running");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executorService.submit(()->{
            try {
                Thread.sleep(4000L);
                System.out.println("Thread 2 Running");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executorService.shutdown();

        executorService.awaitTermination(5000L,TimeUnit.MILLISECONDS);

        if(executorService.isTerminated()){
            System.out.println("Terminated");
        }else{
            System.out.println("On or more tasks still remaining");
        }
    }
}

