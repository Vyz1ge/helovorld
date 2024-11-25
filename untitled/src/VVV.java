import java.util.*;

import static java.util.Collections.sort;

public class VVV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        String s = scanner.nextLine();
        while(s != "stop"){
            if (s.equals("stop")) {
                break;
            }
            list.add(Integer.parseInt(s));
            s = scanner.nextLine();
        }
        int x = list.size()/3;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            list1.add(list.get(i));
        }
        for (int i = 0; i < x*2; i++) {
            list2.add(list.get(i));
        }
        for (int i = 0; i < list.size() - 1; i++) {
            list3.add(list.get(i));
        }

        Collections.sort(list1);

        int x1 = list1.get(0);
        int x2 = list1.get(1);
//        System.out.println(x1);
//        System.out.println(x2);
        int c = 0;
        for (int i = x1; i < x2; i++) {
            c+=i;
        }

        System.out.println(c);

    }
}
