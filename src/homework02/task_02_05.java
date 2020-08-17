package homework02;

//Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.

import java.util.Random;

public class task_02_05 {
    public static void main(String[] args) {

        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt();
            System.out.println(numbers[i]);
        }

        int positive = 0;
        int negative = 0;

        for (int i : numbers) {
            if (i > 0) {
                positive++;
            } else if (i < 0) {
                negative++;
            }
        }

        System.out.println("В наборе " + positive + " положительное(х) и " + negative + " отрицательных(ое) чисел.");
    }
}
