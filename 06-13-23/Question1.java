class ThreadV1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Question1 extends Thread {
    public static void main(String[] args) {
        ThreadV1 thread = new ThreadV1();
        thread.start();
    }
}