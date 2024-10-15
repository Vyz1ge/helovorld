package AwaitandNotify;

public class Test {
    public static void main(String[] args) {
        fdsdafs fdsdafs = new fdsdafs();
        Thread thread = new Thread(fdsdafs);
        thread.start();
        System.out.println("bb");
        fdsdafs fdsdafs2 = new fdsdafs();
        Thread thread1 = new Thread(fdsdafs2);
        thread1.start();
    }
}
class fdsdafs implements Runnable{

    @Override
    public void run() {
        System.out.println("go pls");
    }
}
