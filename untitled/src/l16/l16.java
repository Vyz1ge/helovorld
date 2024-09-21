package l16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class l16 {
    public static void main(String[] args) throws FileNotFoundException {
        File filez = new File("chisla.txt");
        printResult(filez);
        //2
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        PrintWriter pw1 = new PrintWriter(file1);
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            pw1.print(random.nextInt(100)+" ");
        }
        pw1.close();
        Scanner scanner2 = new Scanner(file1);
        String line = scanner2.nextLine();
        String[] massline = line.split(" ");
        PrintWriter pw2 = new PrintWriter(file2);
        for (int i = 0; i < 50; i++) {
            double c = 0;
            for (int j = 0; j < 20; j++) {
                c+=Integer.parseInt(massline[i*j]);
            }
            pw2.print(c/20+" ");
        }
        scanner2.close();
        pw2.close();
        printResult(file2);
    }
    public static void printResult(File file) throws FileNotFoundException {
        //1
        
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] massline = line.split(" ");
        double c = 0;
        for (int i = 0; i < massline.length; i++) {
            c+=Double.parseDouble(massline[i]);
        }
        scanner.close();
        System.out.println();
        System.out.printf("%.3f",c/ massline.length);
    }
}
