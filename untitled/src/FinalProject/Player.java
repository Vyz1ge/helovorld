package FinalProject;

public class Player {
    private String name;
    private ObjectOnMap[][] map = new ObjectOnMap[13][13];
    private int point;
    public Player(String name) {
        this.name = name;
        this.point = 0;
    }

    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public ObjectOnMap[][] getMap() {
        return map;
    }

    public void setMap(ObjectOnMap[][] map) {
        this.map = map;
    }
}
