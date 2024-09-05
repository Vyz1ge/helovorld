import java.util.Scanner;

public class l2 {
    public static void main(String[] args) {
        //1
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        if (z>=1 && z<=4){
            System.out.println("Малоэтажный дом");
        }
        else if (z>=5 && z<=8){
            System.out.println("Среднеэтажный дом");
        }
        else if (z>=9){
            System.out.println("Многоэтажный дом");
        }
        else {
            System.out.println("Ошибка ввода");
        }
        //2
        Scanner scz = new Scanner(System.in);
        int a = scz.nextInt();
        int b = scz.nextInt();
        for (int i = a; i < b; i++) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.println(i);
            }
        }
        //3
        Scanner sczaa = new Scanner(System.in);
        int ah = sczaa.nextInt();
        int bh = sczaa.nextInt();
        while (ah <= bh) {
            if (ah % 5 == 0 && ah % 10 != 0) {
                System.out.println(ah);
            }
            a++;
        }
        //4
        Scanner scxzz = new Scanner(System.in);
        double n = scxzz.nextInt();
        if (n >= 5){
            System.out.println((n*n-10)/(n+7));
        } else if (n>-3 && n<5) {
            System.out.println((n+3)*(n*n-2));
        }
        else {
            System.out.println("420");
        }
    }
}
