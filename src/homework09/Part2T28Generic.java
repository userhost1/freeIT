package homework09;

//  Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
//  Реализовать метод get(int index), который возвращает любой элемент массива по индексу.

import java.util.ArrayList;

public class Part2T28Generic {
    public static void main(String[] args) {

        ElementsClass<Integer> integerClass = new ElementsClass<>();
        integerClass.add(5);
        System.out.println(integerClass.get(0));

        ElementsClass<String> stringClass = new ElementsClass<>();
        stringClass.add("String");
        System.out.println(stringClass.get(0));
        System.out.println(stringClass.get(1)); //check for getting wrong index

        ElementsClass<Character> characterClass = new ElementsClass<>();
        characterClass.add('6');
        characterClass.add((char) 55);
        System.out.println(characterClass.get(0));
        System.out.println(characterClass.get(1));

        ElementsClass<Boolean> booleanClass = new ElementsClass<>();
        booleanClass.add(true);
        booleanClass.add(false);
        System.out.println(booleanClass.get(0));
        System.out.println(booleanClass.get(1));


    }

    public static class ElementsClass<T> {
        private ArrayList<T> elements = new ArrayList<T>();

        public void add(T element) {
            elements.add(element);
        }

        public T get(int index) {
            if (index >= 0 && index < elements.size()) {
                return elements.get(index);
            } else {
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


