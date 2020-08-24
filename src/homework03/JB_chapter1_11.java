package homework03;

import java.util.Random;

//  Имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и себя.

public class JB_chapter1_11 {
    public static void main(String[] args) {

        Random rand = new Random();

        int num = rand.nextInt(999) + 1;

        System.out.print("Число: " + num);

        for (int div = num / 2; div >= 1; div--) {

            if (div == 1) {
                System.out.println(" - простое.");
                break;
            } else if (num % div == 0) {
                System.out.println(" - составное. Делитель: " + div);
                break;
            }

        }

    }
}
