package Threeeeeeeeeeaaaaaaaad;

public class Work {
    public static void main(String[] args) throws InterruptedException { // неоптемизированная версмя . . .
        Work work = new Work();
        work.working();
        System.out.println(work.counter);
    }
    public int counter;
    public void dowork1(){
        for (int i = 0; i < 10000; i++) {
            counter++;
        }
    }
    public void dowork2(){
        for (int i = 0; i < 10000; i++) {
            counter++;
        }
    }
    public void working() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                dowork1();
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                dowork2();
            }
        });
        thread.start();
        thread1.start();
        thread.join();
        thread1.join();
    }

}
