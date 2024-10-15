package Potok;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyTreed treed = new MyTreed();
        treed.start();
        scanner.nextLine();
        treed.off();
    }
}
