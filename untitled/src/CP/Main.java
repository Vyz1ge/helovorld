package CP;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ConsumerProducer cp = new ConsumerProducer();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                cp.produce();
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                cp.consume();
            }
        });
        thread1.start();
        thread.start();
        try {
            thread1.join();
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

class ConsumerProducer{
    private Object look = new Object();
    private Queue queue = new LinkedList();
    private Random random = new Random();
    public void produce(){
        while (true) {
            synchronized (look) {
                while (queue.size() == 10) {
                    try {
                        look.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                int g = random.nextInt(10);
                queue.add(g);
                System.out.println(g+ " - элемент был добавлен, теперь всего "+ queue.size()+"элементов. Вот сам массив"+queue);
                look.notify();
            }
        }
    }
    public void consume(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        while (true) {
            synchronized (look) {
                while (queue.size() == 0) {
                    try {
                        look.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(queue.remove()+ " - элемент удалён, теперь всего "+ queue.size()+" элементов. Вот сам массив "+queue);

                look.notify();
            }
        }
    }
}
