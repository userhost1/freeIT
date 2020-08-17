package homework02;

//Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.

import java.util.Random;

public class task_02_04 {
    public static void main(String[] args) {

        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt();
            System.out.println(numbers[i]);
        }

        int count = 0;

        for (int i : numbers) {
            if (i > 0) {
                count++;
            }
        }

        switch (count) {
            case 1 -> System.out.format("В наборе %d положительное число.", count);
            case 2, 3 -> System.out.format("В наборе %d положительных числа.", count);
            default -> System.out.println("В наборе нет положительных чисел!");
        }
    }
}
