package LOOK;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLook {
    public static void main(String[] args) throws InterruptedException {
        PC pc = new PC();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.first();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.second();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread.start();
        thread1.start();
        thread.join();
        thread1.join();
        pc.info();

    }
}

class PC {
    public void Trylook(Lock lock1, Lock lock2){
        boolean tryfirstlock = false;
        boolean trysecondlock = false;
        while (true){
            try {
                tryfirstlock = lock1.tryLock();
                trysecondlock = lock2.tryLock();
            }
            finally {
                if (tryfirstlock && trysecondlock){
                    return;
                }
                if (tryfirstlock){
                    lock1.unlock();
                }
                if (trysecondlock){
                    lock2.unlock();
                }
            }
        }
    }


    private Random random = new Random();
    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();
    private Accaunt accaunt1 = new Accaunt();
    private Accaunt accaunt2 = new Accaunt();

    public void first() throws InterruptedException {
        for (int i = 0; i < 10_000_000; i++) {
            Trylook(lock1,lock2);
            try {
            int value = random.nextInt(10);
            Accaunt.sendbalance(accaunt1, accaunt2, value);
            System.out.println("acc1 -> acc2 " + value);
            }
            finally {
            lock1.unlock();
            lock2.unlock();
            }

        }
    }

    public void second() throws InterruptedException {
        for (int i = 0; i < 10_000_000; i++) {
            Trylook(lock2,lock1);
            try {
            int value = random.nextInt(10);
            Accaunt.sendbalance(accaunt2, accaunt1, value);
            System.out.println("acc2 -> acc1 " + value);
            }
            finally {
            lock1.unlock();
            lock2.unlock();
            }

        }
    }

    public void info() {
        System.out.println("balance1: " + accaunt1.getBalance());
        System.out.println("balance2: " + accaunt2.getBalance());
        System.out.println(accaunt1.getBalance() + accaunt2.getBalance());
    }
}

class Accaunt {
    private int id;
    private int balance = 10000;

    private void deposit(int balance) {
        this.balance += balance;
    }

    private void minus(int balance) {
        this.balance -= balance;
    }

    public static void sendbalance(Accaunt ac1, Accaunt ac2, int value) {
        ac1.minus(value);
        ac2.deposit(value);
    }

    public int getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }
}
