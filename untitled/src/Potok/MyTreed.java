package Potok;

public class MyTreed extends Thread {
    private volatile boolean CVV = true;
    public void off(){
        this.CVV = false;
    }
    public void run() {
        while (CVV) {
            try {
                Thread.sleep(100);
                System.out.println("GoodGame");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
