package AwaitandNotify;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AwaitAntNotify awaitAntNotify = new AwaitAntNotify();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                awaitAntNotify.produce();
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                awaitAntNotify.comsume();
            }
        });
        thread.start();
        thread1.start();
        thread1.join();
        thread1.join();
    }
}
class AwaitAntNotify{
    public void produce() {
        synchronized (this) {
            System.out.println("Исполняю ожидание нотифая");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("ДА НАКОНЕЦ-то");
        }
    }
    public void comsume(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized(this){
            System.out.println("Исполняю нотифай через 5 сек");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            notify();
            System.out.println("Да лол обманка надо ждать не нотифая а завершения метода в котором нотифай");
            System.out.println("Да лол обманка надо ждать не нотифая а завершения метода в котором нотифай");
            System.out.println("Да лол обманка надо ждать не нотифая а завершения метода в котором нотифай");
        }
    }
}