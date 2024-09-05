import java.util.Scanner;

public class l3 {
    public static void main(String[] args) {
        //1
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        while (!(s.equals("Stop"))) {
            switch (s) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    break;
                default:
                    System.out.println("Неизвестная страна");
                    break;
            }
            s = in.nextLine();

        }
        //2
        Scanner sc = new Scanner(System.in);
        double delimoe = sc.nextDouble();
        double delitel = sc.nextDouble();
        while (delitel != 0){
            System.out.println(delimoe / delitel);
            delimoe = sc.nextDouble();
            delitel = sc.nextDouble();
        }

        //3
        Scanner sc1 = new Scanner(System.in);
        int counter = 1;
        while (counter < 5){
            double delimoe1 = sc1.nextDouble();
            double delitel1 = sc1.nextDouble();
            if (delitel1 == 0) {
                System.out.println("деление на 0");
                continue;
            }
            System.out.println(delimoe1/delitel1);
            counter++;
        }
    }
}

