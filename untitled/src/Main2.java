public class Main2 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.Interectwith("Hello!");
        Singleton singleton2 = Singleton.Interectwith("Hello!");
        singleton.setValue("HI");
        System.out.println(singleton == singleton2);
        System.out.println(singleton);
        System.out.println(singleton2);
        System.out.println(singleton.getValue());
        System.out.println(singleton2.getValue());
    }
}
