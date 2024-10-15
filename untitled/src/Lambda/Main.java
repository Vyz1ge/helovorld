package Lambda;


interface tyt_net_metoda_a_prosto_ego_nazvanie00 {
    void nedometod();
}

class ya_tyt_realizyu_etot_metod implements tyt_net_metoda_a_prosto_ego_nazvanie00{

    @Override
    public void nedometod() {
        System.out.println("Рил без путанницы очень всё прям ну изи");
    }
}

public class Main {
    public static void main(String[] args) {
        ya_tyt_realizyu_etot_metod etotMetod_primerego = new ya_tyt_realizyu_etot_metod();
        etotMetod_primerego.nedometod();
    }
}


