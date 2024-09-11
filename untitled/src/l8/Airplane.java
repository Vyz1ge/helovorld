package l8;
class Airplane {
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
    //1
    public static void compareAirplanes(Airplane a1, Airplane a2){
        if (a1.getLength() > a2.getLength()){
            System.out.println(a1.producer+" длиннее");
        }
        else if (a2.getLength() > a1.getLength()){
            System.out.println(a2.producer+" длиннее");
        }
        else {
            System.out.println("=");
        }
    }

    public int getLength() {
        return length;
    }
    public String toString(){
        return "Изготовитель: "+producer+", год выпуска: "+year+", длина: "+length+", вес: "+weight+", количество топлива в баке: " + fuel;
    }
}
