package CO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("A");
        list.add("AB");
        list.add("Z");
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, new StrComparatore());
        System.out.println(list);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()){
                    return -1;
                }
                else if (o1.length() < o2.length()){
                    return 1;
                }
                return 0;
            }
        });
        System.out.println(list);
    }
}
