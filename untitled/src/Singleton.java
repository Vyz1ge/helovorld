public class Singleton {
    public static Singleton Interect;
    private String value;

    public Singleton getInterect() {
        return Interect;
    }

    public void setInterect(Singleton interect) {
        Interect = interect;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private Singleton(String value){
        this.value = value;
    }

    public static Singleton Interectwith(String value){
        if(Interect == null){
            Interect = new Singleton(value);
        }
        return Interect;
    }
}
