package Thread;

public class Main {
    public static void main(String[] args) {
        NewThread newThread = new NewThread();
        newThread.start();
        System.out.println("H");
        Thread rr = new Thread(new Hi());
        rr.start();
    }
}
