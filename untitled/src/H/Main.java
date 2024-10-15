package H;

public class Main {
    public static void main(String[] args) {
        Contskcsapp contskcsapp = new Contskcsapp();
        contskcsapp.newcontscts("fdggfds",777721);
        contskcsapp.newcontscts("fgdsgdfs",912222);
        contskcsapp.newcontscts("gfdgsfd",912223);
        contskcsapp.newcontscts("Tom",8777712);
        System.out.println(contskcsapp);
        contskcsapp.remove("gfds");
        System.out.println(contskcsapp);
        contskcsapp.searchNumberForName("Vlad");
        contskcsapp.searchNumberForName("Slava");
    }
}
