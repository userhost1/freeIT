package homework10;

import java.util.*;

//Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся числа.
// Здесь 2 варианта. 1 сделан с ArrayList, 2 с TreeSet

public class Part3T30 {
    public static void main(String[] args) {

        List<Integer> numbers1 = new ArrayList<>();
        Set<Integer> numbers2 = new TreeSet<>();

        for (int i = 0; i < 20; i++) {
            numbers1.add((int) (Math.random() * (-10)) + 10);
            int num = (int) (Math.random() * (-10) + 10);
            numbers2.add(num);
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("ArrayList [before removing] " + numbers1);
//        System.out.println("TreeSet [before removing] " + numbers2);

        for (int i = 0; i < numbers1.size() - 1; i++) {
            for (int j = i + 1; j < numbers1.size(); j++) {
                if (numbers1.get(i).equals(numbers1.get(j))) {
                    numbers1.remove(j);
                    j--;
                }
            }
        }
        Collections.sort(numbers1);
        System.out.println("ArrayList [after removing] " + numbers1);
        System.out.println("TreeSet [after removing] " + numbers2);
    }
}
