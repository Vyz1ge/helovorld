package AL;

import java.util.Arrays;

public class SimpleIntegerArrayList {
    private Integer[] elements; // Массив для хранения элементов
    private int size; // Текущий размер списка

    // Конструктор, который создает список с начальной вместимостью 10
    public SimpleIntegerArrayList() {
        elements = new Integer[10]; // Начальный размер массива
        size = 0; // Начальный размер списка
    }

    // Метод для добавления нового элемента в конец списка
    public void add(Integer value) {
        if (size == elements.length) {
            // Если массив заполнен, увеличиваем его размер в 2 раза
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size] = value; // Добавляем новый элемент
        size++; // Увеличиваем размер списка
    }

    // Метод для удаления элемента по индексу
    public void remove(int index) {
        if (index >= size || index < 0) {
            System.out.println("Ошибка: индекс вне диапазона!");
            return;
        }
        // Смещаем элементы влево, начиная с указанного индекса
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null; // Последний элемент удаляем
        size--; // Уменьшаем размер списка
    }

    // Метод для получения элемента по индексу
    public Integer get(int index) {
        if (index >= size || index < 0) {
            System.out.println("Ошибка: индекс вне диапазона!");
            return null;
        }
        return elements[index]; // Возвращаем элемент
    }

    // Метод для получения текущего размера списка
    public int size() {
        return size;
    }

    // Печать списка (для удобства)
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SimpleIntegerArrayList list = new SimpleIntegerArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.print(); // 10 20 30

        list.remove(1);
        list.print(); // 10 30

        System.out.println(list.get(0)); // 10
        System.out.println(list.get(1)); // 30
    }
}
