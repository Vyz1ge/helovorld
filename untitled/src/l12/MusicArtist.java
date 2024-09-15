package l12;

public class MusicArtist {
    private String usss;
    private int yee;

    public MusicArtist(String usss, int yee) {
        this.usss = usss;
        this.yee = yee;
    }

    public String getUsss() {
        return usss;
    }

    public void setUsss(String usss) {
        this.usss = usss;
    }

    public int getYee() {
        return yee;
    }

    public void setYee(int yee) {
        this.yee = yee;
    }

    @Override
    public String toString() {
        return "MusicArtist{" +
                "usss='" + usss + '\'' +
                ", yee=" + yee +
                '}';
    }
}
