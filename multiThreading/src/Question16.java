package Threading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Question16 {

    Lock lock1 = new ReentrantLock(true);


    Lock lock2 = new ReentrantLock(true);

    public void acquireLock(Lock lock1, Lock lock2){

        boolean acquireLock1= lock1.tryLock();
        boolean acquireLock2= lock2.tryLock();

        if(acquireLock1 && acquireLock2){
            return;
        }

        if(acquireLock1){
            lock1.unlock();//if lock1 is aquired by any thread just unlock it so that it can be used by other
        }

        if(acquireLock2){
            lock2.unlock();//if lock2 is aquired by any thread just unlock it so that it can be used by other
        }

    }

    public void worker1(){
        acquireLock(lock1,lock2);
        System.out.println("lock 1 worker 1");

        System.out.println("lock 2 worker 1");
        System.out.println("now the work is done for thread1 it will unlock all the resources");
        lock2.unlock();
        lock1.unlock();
    }

    public void worker2(){
        acquireLock(lock2,lock1);
        System.out.println("lock 1 worker 2");
        System.out.println("lock 2 worker 2");
        System.out.println("now the work is done for thread2 it will unlock all the resources");
       lock1.unlock();
        lock2.unlock();
    }

    public static void main(String[] args) throws InterruptedException {
        Question16 ques = new Question16();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ques.worker1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ques.worker2();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}

