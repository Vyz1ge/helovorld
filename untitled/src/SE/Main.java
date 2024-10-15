package SE;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(4);
        semaphore.acquire();
        System.out.println("hiD");
        semaphore.acquire();
        System.out.println("hiD");
        semaphore.acquire();
        System.out.println("hiD");
        semaphore.acquire();
        System.out.println("hiD");
        semaphore.release();
        semaphore.acquire();
        semaphore.acquire();
        System.out.println("hiD");



    }
}
