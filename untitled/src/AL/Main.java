package AL;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(-44);
        myArrayList.add(133);
        myArrayList.add(44);
        myArrayList.add(3232);
        myArrayList.add(2);
        System.out.println(myArrayList.get(3));
        System.out.println(myArrayList);
        myArrayList.remove(6);
        System.out.println(myArrayList);
    }
}
