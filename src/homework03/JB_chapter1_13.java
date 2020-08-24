package homework03;

//  Создать массив оценок произвольной длины, вывести максимальную и минимальную оценку, её (их) номера.

import java.util.Arrays;
import java.util.Random;

public class JB_chapter1_13 {
    public static void main(String[] args) {

        int[] numsArr = new int[10];

        for (int i = 0; i < numsArr.length; i++) {
            numsArr[i] = new Random().nextInt(99) + 1;
        }

        System.out.println(Arrays.toString(numsArr));

        int minPosition = 0;
        int maxPosition = 0;
        int minNum = numsArr[minPosition];
        int maxNum = numsArr[maxPosition];


        for (int i = 0; i < numsArr.length; i++) {

            if (minNum > numsArr[i]) {
                minNum = numsArr[i];
                minPosition = i;
            }

            if (maxNum < numsArr[i]) {
                maxNum = numsArr[i];
                maxPosition = i;
            }

        }
        System.out.println("Позиция: " + minPosition + " MIN число: " + minNum);
        System.out.println("Позиция: " + maxPosition + " MAX число: " + maxNum);
    }
}
