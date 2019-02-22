import java.util.concurrent.*;

public class Question_6 {


        public static void main(String[] args) throws ExecutionException, InterruptedException {
            ExecutorService executorService = Executors.newSingleThreadExecutor();

            Future<Integer> integerFuture = executorService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    return 2;
                }
            });

            executorService.shutdown();

            if (integerFuture.isDone()) {
                System.out.println(integerFuture.get());
            }
//            else if(integerFuture.isCancelled()){
//                System.out.println("Your task has been cancelled");
//            }

        }
    }

