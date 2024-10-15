package AL;

import java.util.Arrays;

public class MyArrayList {
    private static int size;
    private int[] array;

    MyArrayList(){
        array = new int[10];
        size = 0;
    }

    public void add(int value){
        if (array.length == size){
            arraysizepluw(array);
        }
        array[size] = value;
        size++;
    }
    public static void arraysizepluw(int[] array){
        int[] newarr = new int[(array.length)*2];
        for (int i = 0; i < array.length; i++) {
            newarr[i] = array[i];
        }
        array = newarr;
    }
    public void remove(int idx){
        for (int i = idx; i < array.length - 1; i++) {
            array[i] = array[i+1];
        }
        array[size - 1] = 0;
        size--;
    }

    public int get(int idx){
        return array[idx];
    }


    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}