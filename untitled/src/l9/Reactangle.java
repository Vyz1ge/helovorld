package l9;

public class Reactangle extends Figure {
    private int shirina;
    private int visota;

    public Reactangle(int shirina, int visota,String color) {
        super(color);
        this.shirina = shirina;
        this.visota = visota;
    }

    @Override
    public double area(){
        return shirina*visota;
    }

    @Override
    public double perimeter() {
        return 2*(shirina+visota);
    }
}
