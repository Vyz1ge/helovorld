package Threeeeeeeeeeaaaaaaaad;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Worker {
    public static void main(String[] args) {
        new Worker().working();
    }
    Random random = new Random();
    Object look1 = new Object();
    Object look2 = new Object();
    private ArrayList<Integer> arrayList1 = new ArrayList<>();
    private ArrayList<Integer> arrayList2 = new ArrayList<>();
    public void work1(){
        synchronized (look1){
//        try {
//            Thread.sleep(1);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        arrayList1.add(random.nextInt(100));
    }}
    public void work2(){
        synchronized (look2){
//        try {
//        Thread.sleep(1);
//        } catch (InterruptedException e) {
//        throw new RuntimeException(e);
//        }
        arrayList2.add(random.nextInt(100));
    }}
    public void prepare(){
        for (int i = 0; i < 1000; i++) {
            work1();
            work2();
        }
    }
    public void working(){
        long a = System.currentTimeMillis();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                prepare();
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                prepare();
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
        long b = System.currentTimeMillis();
        System.out.println("время выполнения " + (b - a));
        System.out.println(arrayList1.size());
        System.out.println(arrayList2.size());
    }
}
