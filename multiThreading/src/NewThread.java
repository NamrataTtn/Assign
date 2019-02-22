public class NewThread implements Runnable {

        @Override
        public void run() {
            System.out.println("Running New Thread");
        }


        public static void main(String[] args) {
            new Thread(new NewThread())
                    .start();
        }
    }

