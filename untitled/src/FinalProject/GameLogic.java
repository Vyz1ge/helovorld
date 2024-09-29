package FinalProject;
import java.util.Scanner;
public class GameLogic {
    private static boolean EX = false;
    public static void setmapdefault(Player p){
        ObjectOnMap[][] mapr = new ObjectOnMap[13][13];
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 13; j++) {
                if ((i == 0) || (i == 11) || (j == 0) || (j == 11) || (i == 12) || (j == 12)){
                    mapr[i][j] = ObjectOnMap.BORDER;
                }
                else {
                    mapr[i][j] = ObjectOnMap.VOID;
                }
            }
        }
        p.setMap(mapr);

    }
    public static void bombp1p2(Player p1, Player p2) {
        try {
            ObjectOnMap[][] map1 = p1.getMap();
            ObjectOnMap[][] map2 = p2.getMap();
            Scanner sc = new Scanner(System.in);
            while (!(p1.getPoint() == 20 || p2.getPoint() == 20)) {
                System.out.println("Стреляет " + p1.getName());
                String line = sc.nextLine();
                String[] masl = line.split(":");
                if (map2[Integer.parseInt(masl[0]) + 1][Integer.parseInt(masl[1]) + 1] == ObjectOnMap.SHIP) {
                    System.out.println("попал");
                    p1.setPoint(p1.getPoint() + 1);
                    map2[Integer.parseInt(masl[0]) + 1][Integer.parseInt(masl[1]) + 1] = ObjectOnMap.SHIP_BOMB;
                    p2.setMap(map2);
                    int px1 = 0;
                    while (px1 == 0) {
                        line = sc.nextLine();
                        masl = line.split(":");
                        if (map2[Integer.parseInt(masl[0]) + 1][Integer.parseInt(masl[1]) + 1] == ObjectOnMap.SHIP) {
                            System.out.println("попал");
                            p1.setPoint(p1.getPoint() + 1);
                            map2[Integer.parseInt(masl[0]) + 1][Integer.parseInt(masl[1]) + 1] = ObjectOnMap.SHIP_BOMB;
                            p2.setMap(map2);
                        } else {
                            System.out.println("не попал");
                            map2[Integer.parseInt(masl[0]) + 1][Integer.parseInt(masl[1]) + 1] = ObjectOnMap.VOID_BOMB;
                            px1 = 1;
                            p2.setMap(map2);
                        }
                    }
                    int px2 = 0;
                    while (px2 == 0) {
                        System.out.println("Стреляет " + p2.getName());
                        line = sc.nextLine();
                        masl = line.split(":");
                        if (map1[Integer.parseInt(masl[0]) + 1][Integer.parseInt(masl[1]) + 1] == ObjectOnMap.SHIP) {
                            System.out.println("попал");
                            p2.setPoint(p2.getPoint() + 1);
                            map1[Integer.parseInt(masl[0]) + 1][Integer.parseInt(masl[1]) + 1] = ObjectOnMap.SHIP_BOMB;
                            p1.setMap(map1);
                        } else {
                            System.out.println("не попал");
                            map1[Integer.parseInt(masl[0]) + 1][Integer.parseInt(masl[1]) + 1] = ObjectOnMap.VOID_BOMB;
                            p1.setMap(map1);
                            px2 = 1;
                        }
                    }
                } else {
                    System.out.println("не попал");
                    map2[Integer.parseInt(masl[0]) + 1][Integer.parseInt(masl[1]) + 1] = ObjectOnMap.VOID_BOMB;
                    p2.setMap(map2);
                    int px2 = 0;
                    while (px2 == 0) {
                        System.out.println("Стреляет " + p2.getName());
                        line = sc.nextLine();
                        masl = line.split(":");
                        if (map1[Integer.parseInt(masl[0]) + 1][Integer.parseInt(masl[1]) + 1] == ObjectOnMap.SHIP) {
                            System.out.println("попал");
                            p2.setPoint(p2.getPoint() + 1);
                            map1[Integer.parseInt(masl[0]) + 1][Integer.parseInt(masl[1]) + 1] = ObjectOnMap.SHIP_BOMB;
                            p1.setMap(map1);
                        } else {
                            System.out.println("не попал");
                            map1[Integer.parseInt(masl[0]) + 1][Integer.parseInt(masl[1]) + 1] = ObjectOnMap.VOID_BOMB;
                            p1.setMap(map1);
                            px2 = 1;
                        }
                    }
                }
            }
            if (p1.getPoint() == 20) {
                System.out.println("выйграл " + p1.getName());
            } else {
                System.out.println("выйграл " + p2.getName());
            }
        }
        catch (Exception e){
            System.out.println("заного");
            bombp1p2(p1,p2);
        }
    }


    public static void setshipsforplayer(Player p){
        Scanner s = new Scanner(System.in);
        System.out.println("Ставь корабли "+ p.getName());
        System.out.println("Корабль X:Y;X:Y;X:Y;X:Y");
        EX = false;
        while (!EX) {
            lineforinstallship(s.nextLine(),4,p);
        }
        printmap(p);
        EX = false;
        System.out.println("Корабль X:Y;X:Y;X:Y");
        while (!EX) {
            lineforinstallship(s.nextLine(),3,p);
        }
        printmap(p);
        EX = false;
        System.out.println("Корабль X:Y;X:Y;X:Y");
        while (!EX) {
            lineforinstallship(s.nextLine(),3,p);
        }
        printmap(p);
        EX = false;
        System.out.println("Корабль X:Y;X:Y");
        while (!EX) {
            lineforinstallship(s.nextLine(),2,p);
        }
        printmap(p);
        EX = false;
        System.out.println("Корабль X:Y;X:Y");
        while (!EX) {
            lineforinstallship(s.nextLine(),2,p);
        }
        printmap(p);
        EX = false;
        System.out.println("Корабль X:Y;X:Y");
        while (!EX) {
            lineforinstallship(s.nextLine(),2,p);
        }
        printmap(p);
        EX = false;
        System.out.println("Корабль X:Y");
        while (!EX) {
            lineforinstallship(s.nextLine(),1,p);
        }
        printmap(p);
        EX = false;
        System.out.println("Корабль X:Y");
        while (!EX) {
            lineforinstallship(s.nextLine(),1,p);
        }
        printmap(p);
        EX = false;
        System.out.println("Корабль X:Y");
        while (!EX) {
            lineforinstallship(s.nextLine(),1,p);
        }
        printmap(p);
        EX = false;
        System.out.println("Корабль X:Y");
        while (!EX) {
            lineforinstallship(s.nextLine(),1,p);
        }
        printmap(p);
    }
    public static void printmap(Player p){
        ObjectOnMap[][] map = p.getMap();
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

    private static void lineforinstallship(String line,int n,Player p){
        try {
            ObjectOnMap[][] mapr = p.getMap();
            if (n == 1){
                String[] mas1 = line.split(":");
                int X = Integer.parseInt(mas1[0]) + 1;
                int Y = Integer.parseInt(mas1[1]) + 1;
                if (mapr[X][Y] == ObjectOnMap.BORDER){
                    EX = false;
                    return;
                }
                if (!(mapr[X][Y] == ObjectOnMap.SHIP || mapr[X+1][Y] == ObjectOnMap.SHIP || mapr[X-1][Y] == ObjectOnMap.SHIP
                        || mapr[X][Y+1] == ObjectOnMap.SHIP || mapr[X][Y-1] == ObjectOnMap.SHIP
                        || mapr[X+1][Y+1] == ObjectOnMap.SHIP || mapr[X-1][Y-1] == ObjectOnMap.SHIP
                        || mapr[X+1][Y-1] == ObjectOnMap.SHIP || mapr[X-1][Y+1] == ObjectOnMap.SHIP
                )){
                    mapr[X][Y] = ObjectOnMap.SHIP;
                    p.setMap(mapr);
                    EX = true;
                    return;
                }
                else {
                    System.out.println("бб");
                    EX = false;
                    return;
                }
            }
            ObjectOnMap[][] maprq = p.getMap();
            String[] massline = line.split(";");
            String[] mas = massline[0].split(":");
            int cordX = Integer.parseInt(mas[0])+1;
            int cordY = Integer.parseInt(mas[1])+1;
            for (int i = 1; i < n; i++) {
                String[] massl = massline[i].split(":");
                if (cordX + 1 == Integer.parseInt(massl[0])+1 || cordY + 1 == Integer.parseInt(massl[1])+1){
                    if (i == 1){
                        int X = cordX;
                        int Y = cordY;
                        if (!(maprq[X][Y] == ObjectOnMap.SHIP || maprq[X+1][Y] == ObjectOnMap.SHIP || maprq[X-1][Y] == ObjectOnMap.SHIP || maprq[X][Y+1] == ObjectOnMap.SHIP || maprq[X][Y-1] == ObjectOnMap.SHIP || maprq[X+1][Y+1] == ObjectOnMap.SHIP || maprq[X-1][Y-1] == ObjectOnMap.SHIP || maprq[X+1][Y-1] == ObjectOnMap.SHIP || maprq[X-1][Y+1] == ObjectOnMap.SHIP
                        )) {
                            maprq[Integer.parseInt(mas[0])+1][Integer.parseInt(mas[1])+1] = ObjectOnMap.SHIP;
                        }
                        else {
                            maprq[Integer.parseInt(mas[0])+1][Integer.parseInt(mas[1])+1] = ObjectOnMap.VOID;
                            p.setMap(maprq);
                            EX = false;
                            return;
                        }
                    }
                    int X = Integer.parseInt(massl[0]) + 1;
                    int Y = Integer.parseInt(massl[1]) + 1;
                    if (maprq[X][Y-1] == ObjectOnMap.SHIP ){
                            if (maprq[X-1][Y] == ObjectOnMap.SHIP || maprq[X+1][Y] == ObjectOnMap.SHIP || maprq[X][Y+1] == ObjectOnMap.SHIP || maprq[X+1][Y+1] == ObjectOnMap.SHIP || maprq[X-1][Y+1] == ObjectOnMap.SHIP || maprq[X+1][Y+2] == ObjectOnMap.SHIP || maprq[X][Y+2] == ObjectOnMap.SHIP || maprq[X-1][Y+2] == ObjectOnMap.SHIP){
                            EX = false;
                            maprq[Integer.parseInt(mas[0])+1][Integer.parseInt(mas[1])+1] = ObjectOnMap.VOID;
                            for (int j = 1; j < n; j++){
                                String[] masdel = massline[j].split(":");
                                maprq[Integer.parseInt(masdel[0])+1][Integer.parseInt(masdel[1])+1] = ObjectOnMap.VOID;
                            }
                            p.setMap(maprq);
                            return;
                        }
                    }
                    if (maprq[X][Y-1] == ObjectOnMap.SHIP ){
                        if (maprq[X-1][Y] == ObjectOnMap.SHIP || maprq[X+1][Y] == ObjectOnMap.SHIP || maprq[X][Y+1] == ObjectOnMap.SHIP || maprq[X+1][Y+1] == ObjectOnMap.SHIP || maprq[X-1][Y+1] == ObjectOnMap.SHIP || maprq[X+1][Y+2] == ObjectOnMap.SHIP || maprq[X][Y+2] == ObjectOnMap.SHIP || maprq[X-1][Y+2] == ObjectOnMap.SHIP){
                            EX = false;
                            maprq[Integer.parseInt(mas[0])+1][Integer.parseInt(mas[1])+1] = ObjectOnMap.VOID;
                            for (int j = 1; j < n; j++){
                                String[] masdel = massline[j].split(":");
                                maprq[Integer.parseInt(masdel[0])+1][Integer.parseInt(masdel[1])+1] = ObjectOnMap.VOID;
                            }
                            p.setMap(maprq);
                            return;
                        }
                    }
                    if (maprq[X-1][Y] == ObjectOnMap.SHIP ){
                        if (maprq[X][Y+1] == ObjectOnMap.SHIP || maprq[X][Y-1] == ObjectOnMap.SHIP || maprq[X+1][Y] == ObjectOnMap.SHIP || maprq[X+1][Y+1] == ObjectOnMap.SHIP || maprq[X+1][Y-1] == ObjectOnMap.SHIP || maprq[X+2][Y+1] == ObjectOnMap.SHIP || maprq[X+2][Y] == ObjectOnMap.SHIP || maprq[X+2][Y-1] == ObjectOnMap.SHIP){
                            EX = false;
                            maprq[Integer.parseInt(mas[0])+1][Integer.parseInt(mas[1])+1] = ObjectOnMap.VOID;
                            for (int j = 1; j < n; j++){
                                String[] masdel = massline[j].split(":");
                                maprq[Integer.parseInt(masdel[0])+1][Integer.parseInt(masdel[1])+1] = ObjectOnMap.VOID;
                            }
                            p.setMap(maprq);
                            return;
                        }
                    }
                    if (maprq[X][Y] == ObjectOnMap.BORDER){
                        EX = false;
                        maprq[Integer.parseInt(mas[0])+1][Integer.parseInt(mas[1])+1] = ObjectOnMap.VOID;
                        for (int j = 1; j < n; j++){
                            String[] masdel = massline[j].split(":");
                            maprq[Integer.parseInt(masdel[0])+1][Integer.parseInt(masdel[1])+1] = ObjectOnMap.VOID;
                        }
                        p.setMap(maprq);
                        return;
                    }
                    maprq[Integer.parseInt(massl[0])+1][Integer.parseInt(massl[1])+1] = ObjectOnMap.SHIP;
                    cordX = Integer.parseInt(massl[0]);
                    cordY = Integer.parseInt(massl[1]);
                    p.setMap(maprq);
                    EX = true;
                }
                else {
                    EX = false;
                    maprq[Integer.parseInt(mas[0])+1][Integer.parseInt(mas[1])+1] = ObjectOnMap.VOID;
                    for (int j = 1; j < n; j++){
                        String[] masdel = massline[j].split(":");
                        maprq[Integer.parseInt(masdel[0])+1][Integer.parseInt(masdel[1])+1] = ObjectOnMap.VOID;
                    }
                    p.setMap(maprq);
                    break;
                }
            }
        }
        catch (Exception e){
            EX = false;
            System.out.println("заного");
        }
    }
}
