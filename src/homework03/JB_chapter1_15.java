package homework03;

import java.util.Random;

//  Определите сумму элементов одномерного массива, расположенных между минимальным и максимальным значениями.

public class JB_chapter1_15 {
    public static void main(String[] args) {

        Random rand = new Random();
        int arrSimbol[] = new int[5];
        int positionMin = 0;
        int positionMax = 0;

        for (int i = 0; i < arrSimbol.length; i++) {
            arrSimbol[i] = rand.nextInt(99) + 1;
            System.out.print(arrSimbol[i] + " ");
        }
        System.out.println();

        int minNum = arrSimbol[0];
        int maxNum = arrSimbol[0];
        int totalSumBetweenArr = 0;

        for (int i = 0; i < arrSimbol.length; i++) {
            if (minNum > arrSimbol[i]) {
                minNum = arrSimbol[i];
                positionMin = i;
            }
        }
        for (int i = 0; i < arrSimbol.length; i++) {
            if (maxNum < arrSimbol[i]) {
                maxNum = arrSimbol[i];
                positionMax = i;
            }
        }
        System.out.println("Минимальное число в массиве: " + minNum + ", позиция: " + (positionMin + 1));
        System.out.println("Максимально число в массиве: " + maxNum + ", позиция: " + (positionMax + 1));

        if (positionMin < positionMax) {
            for (int i = positionMin; i <= positionMax; i++) {
                totalSumBetweenArr += arrSimbol[i];
            }
        } else if (positionMax < positionMin) {
            for (int i = positionMax; i <= positionMin; i++) {
                totalSumBetweenArr += arrSimbol[i];
            }
        } else {
            System.out.println("Что-то пошло не так!");
        }
        System.out.println("Сумма между MIN и MAX значением массива включительно: " + totalSumBetweenArr);
    }
}
