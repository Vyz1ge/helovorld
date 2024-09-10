package l6;
//2
public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public int getFuel() {
        return fuel;
    }

    public Airplane(int weight, int length, int year, String producer) {
        this.weight = weight;
        this.length = length;
        this.year = year;
        this.producer = producer;
    }

    public void info(){
        System.out.println("Изготовитель: "+producer+", год выпуска: "+year+", длина: "+length+", вес: "+weight+", количество топлива в баке: " + fuel);
    }
    public void fillUP(int oil){
        fuel+=oil;
    }

}
