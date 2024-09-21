package l15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class l15 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("shoes.csv");
        File filepw = new File("missing_shoes.txt");
        Scanner scanner = new Scanner(file);
        PrintWriter pw = new PrintWriter(filepw);
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] massline = line.split(";");
            if (Integer.parseInt(massline[2]) == 0){
                pw.println(line);
            }
        }
        scanner.close();
        pw.close();
    }
}
