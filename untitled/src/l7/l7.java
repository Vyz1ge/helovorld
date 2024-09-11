package l7;


public class l7 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane(10000, 111, 2000, "Lalalala");
        Airplane airplane2 = new Airplane(20000, 1111111, 2020, "bbbbba4");
        Airplane.compareAirplanes(airplane,airplane2);
        //2
        Player p2 = new Player();
        Player p3 = new Player();
        Player p4 = new Player();
        Player p5 = new Player();
        Player p6 = new Player();
        Player.info();
        System.out.println(p6.getStamina());
        Player p7 = new Player();
        Player.info();
        System.out.println(p7.getStamina());
        for (int i = 0; i < 100; i++) {
            p7.run();
        }
        Player.info();
    }
}
