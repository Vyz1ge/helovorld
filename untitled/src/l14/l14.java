package l14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class l14 {
    public static void main(String[] args) {
        //1
        File file = new File("input.txt");
        try {
            Scanner scanner = new Scanner(file);
            String[] as = scanner.nextLine().split(" ");
            if (as.length != 10){
                throw new ArithmeticException();
            }
            int c = 0;
            for (int i = 0; i <10; i++) {
                c+=Integer.parseInt(as[i]);
            }
            System.out.println(c);
        } catch (FileNotFoundException e) {
            System.out.println("Нет файла");
        }catch (ArithmeticException e){
            System.out.println("gg neverno");
        }
        //2
        File file2 = new File("people.txt");
        try {
            Scanner scanner2 = new Scanner(file2);
            List<String> cccc = new ArrayList<>();
            while (scanner2.hasNextLine()){
                String linee = scanner2.nextLine();
                String[] zx = linee.split(" ");
                if (Integer.parseInt(zx[1]) <= 0)
                {
                    throw new IllegalArgumentException();
                }
                else {
                    System.out.println(linee);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("НЕТ ФАЙЛА");
        }catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
        }
        //3
        File file3 = new File("people.txt");
        System.out.println(parseFileToObject(file3));

    }
    //3
    public static List<Person> parseFileToObject(File file){
        List<Person> l453543l = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] massline = line.split(" ");
                if (Integer.parseInt(massline[1]) > 0)
                {
                    Person pi = new Person(massline[0], Integer.parseInt(massline[1]));
                    l453543l.add(pi);
                }
                else {
                    throw new IllegalArgumentException();
                }
            }
            return l453543l;
        } catch (FileNotFoundException e) {
            System.out.println("НЕТ ФАЙЛА");
        }catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}