package LL;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(12);
        list.add(1);
        list.add(12);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.get(10));
    }
}
