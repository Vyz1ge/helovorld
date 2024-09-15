package l12;

import java.util.ArrayList;
import java.util.List;
public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> as;
    public MusicBand(String name, int year,List<MusicArtist> as) {
        this.name = name;
        this.year = year;
        this.as = as;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MusicArtist> getAs() {
        return as;
    }

    public void setAs(List<MusicArtist> as) {
        this.as = as;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", as=" + as +
                '}';
    }
}
