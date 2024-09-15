package l12;
import java.util.*;
public class l12 {
    public static void main(String[] args) {
        //1
        List<String> list = new ArrayList<>();
        list.add("TeslaS");
        list.add("TeslaM");
        list.add("TeslaC");
        list.add("BuggatiC");
        list.add("BugattiV");
        System.out.println(list);
        list.add(3,"TeslaH");
        list.remove(0);
        System.out.println(list);
        //2
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            if (i%2 == 0){
                list2.add(i);
            }
        }
        for (int i = 300; i < 350; i++) {
            if (i%2 == 0){
                list2.add(i);
            }
        }
        System.out.println(list2);
        //3
        MusicArtist cxz = new MusicArtist("cxz",0);
        MusicArtist aku = new MusicArtist("aku",11);
        MusicArtist morgnshtern = new MusicArtist("morgnshtern",20);
        MusicArtist bigtape = new MusicArtist("bigtape",30);
        List<MusicArtist> z1 = new ArrayList<>();
        List<MusicArtist> z2 = new ArrayList<>();
        z1.add(cxz);
        z1.add(aku);
        z2.add(morgnshtern);
        z2.add(bigtape);
        MusicBand psy = new MusicBand("pssyhokids",3000,z1);
        MusicBand bmo = new MusicBand("BM",1999,z2);
        transfermembers(psy,bmo);
        Collections.shuffle(z2);
        System.out.println(psy);
        System.out.println(bmo);
//        MusicBand Ben = new MusicBand("BG",1800);
//        MusicBand xxx = new MusicBand("oxxxxymiron",2050);
//        MusicBand sha = new MusicBand("shaman",1990);
//        MusicBand pho = new MusicBand("kordhell",3050);
//        MusicBand fff = new MusicBand("fff",4000);
//        MusicBand raz = new MusicBand("shadowraze",2020);
//        MusicBand kiz = new MusicBand("kzbigtape",1000);
//        MusicBand n3k = new MusicBand("lyamnalyam",2001);
//        List<MusicBand> musssic = new ArrayList<>();
//        musssic.add(psy);
//        musssic.add(bmo);
//        musssic.add(Ben);
//        musssic.add(xxx);
//        musssic.add(sha);
//        musssic.add(pho);
//        musssic.add(fff);
//        musssic.add(raz);
//        musssic.add(kiz);
//        musssic.add(n3k);
//        System.out.println(groupsAfter2000(musssic));
    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> musssicaffteer2000 = new ArrayList<>();
        for (MusicBand x: bands){
            if (x.getYear() > 2000){
                musssicaffteer2000.add(x);
            }
        }
        return musssicaffteer2000;
    }
    public static void transfermembers(MusicBand A, MusicBand B){
        for (MusicArtist x: A.getAs()){
            B.getAs().add(x);
        }
        A.getAs().clear();
    }
}
