import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Question_3 {


        public static void main(String[] args) {
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            try {
                executorService.submit(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("Thread 1");
                    }
                });
                executorService.submit(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("Thread 2");
                    }
                });
                executorService.submit(new Runnable() {
                    @Override
                    public void run() {

                        System.out.println("Thread 3");
                        while (true)
                        {
                            System.out.println("Thread");
                            if(Thread.currentThread().isInterrupted())
                            {
                                System.out.println("inter");
                                break;
                            }
                        }

                    }
                });
            } finally {
                executorService.shutdownNow();
//                executorService.shutdown();
            }
            System.out.println("End");
        }
    }




