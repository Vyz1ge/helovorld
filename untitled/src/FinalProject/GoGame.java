package FinalProject;

public class GoGame {
    public static void main(String[] args) {
        Player p1 = new Player("p1");
        Player p2 = new Player("p2");
        GameLogic.setmapdefault(p1);
        GameLogic.setmapdefault(p2);
        GameLogic.setshipsforplayer(p1);
        GameLogic.setshipsforplayer(p2);
        GameLogic.bombp1p2(p1,p2);
    }
}
