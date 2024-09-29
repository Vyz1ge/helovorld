package LL;

import java.util.Arrays;

public class MyLinkedList {
    private Node head;
    private int size;
    public void add(int value){
        if (head == null){
            this.head = new Node(value);
        }
        else {
            Node temp = head;
            while(temp.getA() != null){
                temp = temp.A;
            }
            temp.setA(new Node(value));
        }
        size++;
    }

    @Override
    public String toString() {
        int[] mass = new int[size];
        int idx = 0;
        Node temp = head;
        while (temp != null){
            mass[idx++] = temp.getValue();
            temp = temp.getA();
        }
        return Arrays.toString(mass);
    }

    public void remove(int i){
        if (i == 0){
            head = head.getA();
        }
        else {
            Node temp = head;
            int idx = 0;
            while (idx + 1 != i) {
                temp = temp.getA();
                idx++;
            }
            temp.setA(temp.getA().getA());
        }
        size--;
    }

    public int get(int i){
        Node temp = head;
        int idx = 0;
        while(idx !=  i){
            temp = temp.getA();
        }
        return temp.getValue();
    }

    public static class Node{
        private Node A;
        private int value;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getA() {
            return A;
        }

        public void setA(Node a) {
            A = a;
        }
    }

}
