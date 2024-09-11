package l8;


public class l8 {
    public static void main(String[] args) {

        long before = System.currentTimeMillis();
        String s = new String("");
        for (int i = 0; i < 20000; i++) {
            s = s + i + " ";
        }
        System.out.println(s);
        long after = System.currentTimeMillis();

        System.out.println("\n\n\n");

        long before2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < 20000; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
        long after2 = System.currentTimeMillis();
        System.out.println(after-before);
        System.out.println(after2-before2);
        Airplane airplane = new Airplane(10000, 111, 2000, "Lalalala");
        System.out.println(airplane);
    }
}
