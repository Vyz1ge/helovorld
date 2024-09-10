public class l5 {
    public static void main(String[] args) {
        //1
        Car IlonCar = new Car();
        IlonCar.SetModel("Tesla CYBERTRACK");
        IlonCar.SetColor("Grey");
        IlonCar.SetYear(2024);
        System.out.println("Модель "+ IlonCar.GetModel()+", Цвет "+ IlonCar.GetColor()+", Год "+ IlonCar.GetYear());
        //2
        Motobike BernarA = new Motobike(2025,"braunn-pink","LYIVITON//gucci");
        System.out.println(BernarA.getycm());

    }

}
//1
class Car{
    private int yearburn;
    private String color;
    private String Model;
    public void SetColor(String color){
        this.color = color;
    }
    public void SetYear(int yearburn){
        this.yearburn = yearburn;
    }
    public void SetModel(String Model){
        this.Model = Model;
    }
    public String GetColor(){
        return color;
    }
    public String GetModel(){
        return Model;
    }
    public int GetYear(){
        return yearburn;
    }
}
class Motobike{
    private int y;
    private String c;
    private String m;
    Motobike(int y, String c, String m){
        this.y = y;
        this.c = c;
        this.m = m;
    }
    public String getycm(){
        String z = ""+"Новый мотоцик года "+y+" цвета "+c+" модели "+m;
        return z;
    }
}