package LLREPEAT;

public class Main {
    public static void main(String[] args) {
        MiLinkedList miLinkedList = new MiLinkedList();
        miLinkedList.add("0");
        miLinkedList.add("1");
        miLinkedList.add("2");
        System.out.println(miLinkedList);
        miLinkedList.remove(0);
        System.out.println(miLinkedList);
    }
}
