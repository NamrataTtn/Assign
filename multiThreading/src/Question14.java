package Threading;


public class Question14 {

    public void worker1(){
        synchronized (this) {
            System.out.println("Worker1 Started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker1 Done");
        }
    }

    public void worker2(){
        synchronized (this) {
            System.out.println("Worker 2 Started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker 2 Done");
        }
    }

    public void worker3(){
        synchronized (this) {
            System.out.println("Worker 3 Started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker 3 Done");
        }
    }



    public void worker4(){
        synchronized (this) {
            System.out.println("Worker 4 Started");
            System.out.println("Worker 4 Done");
            System.out.println("Will wake up previous workers");
            notifyAll();
        }
    }

    public static void main(String[] args) {
        Question14 ques = new Question14();
        new Thread(new Runnable() {
            @Override
            public void run() {
                ques.worker1();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                ques.worker2();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                ques.worker3();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                ques.worker4();
            }
        }).start();
    }
}

