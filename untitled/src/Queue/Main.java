package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("A1");
        queue.add("A2");
        queue.add("A3");
        queue.add("A4");
        queue.add("A5");
        for (String x : queue){
            System.out.println(x);
        }
        System.out.println();
        for (String x : queue){
            System.out.println(x);
        }
        System.out.println();
        for (String x : queue){
            System.out.println(x);
        }
    }
}
