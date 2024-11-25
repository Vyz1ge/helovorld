package LLREPEAT;

import java.util.Arrays;

public class MiLinkedList {
    private int size;
    private Node head;
    public void add(String value){
        if (head == null){
            head = new Node(value);
        }
        else {
            Node temp = head;
            while (temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));
        }
        size++;
    }

    public void remove(int idx){
        if (idx == 0){
            head = head.getNext();
            size--;
            return;
        }
        int id = 1;
        Node temp = head;
        while(temp != null){
            if (id == idx) {
                temp.setNext(temp.getNext().getNext());
                size--;
                return;
            }
            temp = temp.getNext();
            id++;
        }
    }


    public String get(int idx){
        int id = 0;
        Node temp = head;
        while(temp != null){
            if (id == idx) {
                return temp.getValue();
            }
            temp = temp.getNext();
            id++;
        }
        return "Элемент выходит за границу массива";
    }

    @Override
    public String toString() {
        String[] sarr = new String[size];
        Node temp = head;
        for (int i = 0; i < size; i++) {
            sarr[i] = temp.getValue();
            temp = temp.getNext();
        }
        return Arrays.toString(sarr);
    }

    class Node{
        private Node next;
        private String value;

        public Node(String value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
