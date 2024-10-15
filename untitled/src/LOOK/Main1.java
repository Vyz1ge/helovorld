package LOOK;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main1 {
    public static void main(String[] args) throws InterruptedException {
        proc proc1 = new proc();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                proc1.first();
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                proc1.second();
            }
        });
        thread.start();
        thread1.start();
        thread.join();
        thread1.join();
        System.out.println(proc.counter);
    }
}

class proc{
    private Lock lock = new ReentrantLock();
    public static int counter;

    public void iterator(){
        lock.lock();
        counter++;
        lock.unlock();
    }

    public void first(){
        for (int i = 0; i < 10000; i++) {
            iterator();
        }
    }
    public void second(){
        for (int i = 0; i < 10000; i++) {
            iterator();
        }
    }
}
