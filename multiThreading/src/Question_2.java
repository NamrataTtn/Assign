public class Question_2 {

        public static void main(String[] args) throws InterruptedException {
            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("Running 1st Thread");
                        Thread.sleep(2000L);
                        System.out.println(" 1st Thread executed");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });


            Thread thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("Running 2nd Thread");
                        thread1.join();
                        Thread.sleep(2000L);
                        System.out.println("2nd  Thread");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            Thread thread3 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {thread2.join();
                        Thread.sleep(2000L);
                        System.out.println("Running 3rd Thread");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            thread1.start();
            thread2.start();
            thread3.start();



            thread3.join();



            System.out.println("Ended....");
        }
    }


