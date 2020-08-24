package homework03;

//  Найдите сумму первых n целых чисел, которые делятся на 3.

import java.util.Random;

public class JB_chapter1_12 {
    public static void main(String[] args) {

        int num = new Random().nextInt(24) + 1;
        int count = 0;
        int result = 0;

        for (int i = 0; count <= num; i++) {
            if (i % 3 == 0) {
                result += i;
                count++;
            }
        }
        System.out.println("Сумма первых " + num + " чисел(числа), которые делятся на 3 = " + result);

    }
}
