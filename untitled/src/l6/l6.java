package l6;

public class l6 {
    public static void main(String[] args) {

        Car IlonCar = new Car();
        IlonCar.SetModel("Tesla CYBERTRACK");
        IlonCar.SetColor("Grey");
        IlonCar.SetYear(2023);
        System.out.println("Модель "+ IlonCar.GetModel()+", Цвет "+ IlonCar.GetColor()+", Год "+ IlonCar.GetYear());
        Motobike BernarA = new Motobike(1900,"braunn-pink","LYIVITON//gucci");
        System.out.println(BernarA.getycm());
        BernarA.info();
        System.out.println(IlonCar.ydd(2024));
        System.out.println(BernarA.ydd(2024));
        Airplane buggttiair = new Airplane(200000,1500,2020,"MORGENSTERN");
        buggttiair.info();
        buggttiair.fillUP(1000);
        buggttiair.info();
        Teacher teacher = new Teacher();
        Student student = new Student();
        teacher.setName("Егор Горов Егорович");
        teacher.setSubject("ИБ");
        student.setFio("Алексей Фёдоров Матвеевич");
        teacher.evaluate(student);
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
    public void info(){
        System.out.println("Это машина");
    }
    public int ydd(int ooooqw){
        return ooooqw - yearburn;
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
    public void info(){
        System.out.println("Это мотоцикл");
    }

    public int getY() {
        return y;
    }
    public int ydd(int ooooqw){
        return ooooqw - y;
    }
}