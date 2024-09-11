package l7;

import java.util.Random;
//2
public class Player {
    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    private static int countP = 0;

    public int getStamina() {
        return stamina;
    }

    Player(){
        if (countP != 6){
            countP++;
        }
        Random r = new Random();
        stamina = r.nextInt(10) + 90;

    }
    public void run(){
        if (stamina > MIN_STAMINA) {
            stamina--;
            if (stamina == MIN_STAMINA){
                countP--;
            }
        }
    }
    public static void info(){
        if (countP == 6){
            System.out.println("Команды полные");
        }
        else {
            System.out.println("есть свободные места: "+(6-countP));
        }
    }
}
