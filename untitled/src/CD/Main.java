package CD;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        CountDownLatch countDownLatch = new CountDownLatch(2);
        for (int i = 0; i < 2; i++) {
            executorService.submit(new Work(i));
            countDownLatch.countDown();
        }
        countDownLatch.await();
        executorService.shutdown();
    }
}
class Work implements Runnable{
    private int id;
    private CountDownLatch countDownLatch;
    public Work(int id,CountDownLatch countDownLatch){
        this.id = id;
        this.countDownLatch = countDownLatch;
    }
    public Work(int id){
        this.id = id;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Working . . . "+ id);
    }
}