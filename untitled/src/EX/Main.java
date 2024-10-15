package EX;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long before = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(10000);
        for (int i = 0; i < 1000000; i++) {
            executorService.submit(new hlo(i));
        }
        executorService.shutdown();
//        executorService.awaitTermination(1,TimeUnit.DAYS);
        long after = System.currentTimeMillis();
        System.out.println(after-before);
    }

}

class hlo implements Runnable{
    private int id;
    public hlo(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Поработал "+id);
    }
}
