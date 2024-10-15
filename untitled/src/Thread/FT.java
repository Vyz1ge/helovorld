package Thread;

public class FT extends Thread{
    private StringBuilder sb;

    public FT(StringBuilder sb) {
        this.sb = sb;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print(sb);
        }
    }
}
