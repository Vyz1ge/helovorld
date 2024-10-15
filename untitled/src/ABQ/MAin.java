package ABQ;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MAin {
    private static BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue(10);
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                produce();
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                consumer();
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
    }
    public static void produce(){
        Random random = new Random();
        while (true) {
            try {
                int n = random.nextInt(10);
                Thread.sleep(1500);
                System.out.println();
                blockingQueue.put(n);
                System.out.println("Выдал элемент " + n);
                System.out.print("\tSIZE  :" + blockingQueue.size()+"\tи теперь наш список элементов такой\t");
                System.out.print(blockingQueue);
                System.out.println();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void consumer(){
        while (true) {
            try {
                Thread.sleep(1500);


                System.out.println();
                System.out.println("Забрал эелемент "+blockingQueue.take());
                System.out.print("\tSIZE  :" + blockingQueue.size()+"\tи теперь наш список элементов такой\t");
                System.out.print(blockingQueue);
                System.out.println();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
