package LThread;

import java.util.Scanner;
public class Main extends Thread {
    private volatile boolean CVV = true;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 1000; i++) {
//                    System.out.println(i);
//                }
//            }
//        });
//
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 1000; i++) {
//                    System.out.println(i);
//                }
//            }
//        });
//        thread.start();
//        thread2.start();

        Main thread3 = new Main();
        thread3.start();
        scanner.nextLine();
        thread3.off();
    }

    public void off(){
        this.CVV = false;
    }
    @Override
    public void run() {
        while (CVV){
                try {
                    Thread.sleep(100);
                    System.out.println("GoodGame");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
        }

    }
}
