import java.util.Random;
import java.util.Scanner;

public class l4 {
    public static void main(String[] args) {
        //1
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random r = new Random();
        int[] a = new int[n];
        for (int i = 0; i<a.length;i++){
            a[i] = r.nextInt(10);
        }
        int c = 0;
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]>8) {
                c++;
            }
            if (a[i]==1) {
                c1++;
            }
            if (a[i]%2==0) {
                c2++;
            }
            else {
                c3++;
            }
            c4+=a[i];
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Длина массива "+a.length);
        System.out.println("Количество чисел больше 8 "+ c);
        System.out.println("Количество чисел равных 1 "+ c1);
        System.out.println("Количество четных чисел "+ c2);
        System.out.println("Количество нечетных чисел "+ c3);
        System.out.println("Сумма всех элементов массива "+ c4);

    //2

    int[] a1 = new int[100];
    Random r1 = new Random();
        for (int i = 0; i < a1.length; i++) {
            a1[i] = r1.nextInt(1000);
        }
        int v = 0;
        int v1 = 1001;
        int v2 = 0;
        int v3 = 0;
        for (int x:a1){
            if (x > v){
                v = x;
            }
            if (x < v1){
                v1 = x;
            }
            if (x%10 == 0){
                v2++;
                v3+=x;
            }
        }
        System.out.println("Наибольший элемент массива "+ v);
        System.out.println("Наименьший элемент массива "+ v1);
        System.out.println("Количество элементов массива, оканчивающихся на 0 "+ v2);
        System.out.println("Cумма элементов массива, оканчивающихся на 0 "+ v3);
        //3
        Random r2 = new Random();
        int[][] a2 = new int[12][8];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 8; j++){
                a2[i][j] = r2.nextInt(50);
            }
        }
        int cz = 0;
        int ibest = 0;
        for (int i = 0; i < 12; i++) {
            int ozy = 0;
            for (int j = 0; j < 8; j++) {
                ozy += a2[i][j];
                System.out.print(a2[i][j] + "\t\t");
            }
            System.out.println();
            System.out.println(ozy);
            System.out.println();
            if (ozy > cz){
                cz = ozy;
                ibest = i;
            }
        }
        System.out.println(ibest);
        System.out.println(cz);
        //4
        Random r4 = new Random();
        int[] a4 = new int[100];
        for (int i = 0; i < a4.length; i++) {
            a4[i] = r4.nextInt(10000);
            System.out.println(a4[i]+"\t\t");
        }
        int uff = 0;
        String ddqq = "";
        System.out.println("\n\n\n\n\n");
        for (int i = 0; i < a4.length-2; i++) {
            int buff = a4[i]+a4[i+1]+a4[i+2];
            if (buff > uff){
                uff = buff;
                ddqq = "[ "+a4[i]+"  "+a4[i+1]+"  "+a4[i+2]+" ]"+"\t\t\t"+i;
            }
        }

        System.out.println(ddqq);


    }
}
