package homework09;

//  Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
//  Реализовать метод get(int index), который возвращает любой элемент массива по индексу.

import java.util.ArrayList;

public class Part2T28Generic {
    public static void main(String[] args) {

        ElementsClass<Object> elements = new ElementsClass<>();
        elements.add("String");
        elements.add('5');
        elements.add(5);
        elements.add((char) 55);

        System.out.println(elements.get(0));
        System.out.println(elements.get(1));
        System.out.println(elements.get(2));
        System.out.println(elements.get(3));
        System.out.println(elements.get(4));
        System.out.println(elements.toString());

    }

    public static class ElementsClass<T> {
        private ArrayList<T> elements = new ArrayList<T>();

        public void add(T element) {
            elements.add(element);
        }

        public T get(int index) {
            try {
                return elements.get(index);
            } catch (Exception e) {
                System.out.print("Вы пытаетесь получить элемент которого нет. ");
                return null;
            }
        }

        @Override
        public String toString() {
            return "ElementsClass{" +
                    "elements=" + elements +
                    '}';
        }
    }
}


