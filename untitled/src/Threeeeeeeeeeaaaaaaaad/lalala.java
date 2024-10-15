package Threeeeeeeeeeaaaaaaaad;

import java.util.ArrayList;
import java.util.Random;

public class lalala {
    public static void main(String[] args) {
        new lalala().working();
    }
    private ArrayList<Integer> arrayList1 = new ArrayList<>();
    private ArrayList<Integer> arrayList2 = new ArrayList<>();
    public void work1(){
        Random random = new Random();
        arrayList1.add(random.nextInt(100));
    }
    public void work2(){
        Random random = new Random();
        arrayList2.add(random.nextInt(100));
    }
    public void prepare(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                work1();
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                work2();
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
    public void working(){
        long a = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            prepare();
        }
        long b = System.currentTimeMillis();
        System.out.println("время выполнения " + (b - a));
        System.out.println(arrayList1.size());
        System.out.println(arrayList2.size());
    }
}
