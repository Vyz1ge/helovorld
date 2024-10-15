package Threeeeeeeeeeaaaaaaaad;

public class Test {
    private int counter;

    public static void main(String[] args) {
        Test test = new Test();
        test.doWork();
    }
    public synchronized void inc(){
        counter++;
    }
    public void doWork(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    inc();
                }
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    inc();
                }
            }
        });
        thread.start();
        thread1.start();
        try {
            thread.join();
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter);
    }
}

