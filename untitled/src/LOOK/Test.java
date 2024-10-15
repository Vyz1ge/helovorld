package LOOK;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        lock.lock();
        lock.unlock();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(lock.tryLock());
            }
        });
        thread.start();
        thread.join();
    }
}
