public class OtherThread extends Thread {

    @Override
    public void run() {
        System.out.println("Running other New Thread");
    }


    public static void main(String[] args) {
        new OtherThread()
                .start();
    }
}
