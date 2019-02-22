package Threading;


public class Question13 {

    public void worker1(){
        synchronized (this) {
            System.out.println("Worker1 Started");
            try {
                System.out.println("worker1 will wait");
                wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker1 Done");
        }
    }



    public void worker4(){
        synchronized (this) {
            System.out.println("Worker 2 Started");
            System.out.println("Worker 2 Done");
            System.out.println("Wake up Worker 1");
            notify();
        }
    }

    public static void main(String[] args) {
        Question13 thread = new Question13();
        new Thread(new Runnable() {
            @Override
            public void run() {
                thread.worker1();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                thread.worker4();
            }
        }).start();
    }
}
