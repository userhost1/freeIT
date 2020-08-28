package homework03;

//Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа различны?

import java.util.Random;

public class JB_chapter1_05 {
    public static void main(String[] args) {

        int number1 = new Random().nextInt(8999) + 1000;
        int number2 = new Random().nextInt(8999) + 1000;

        if ((number1 != number2)) {
            System.out.println("Все цифры числа различны.");
        } else {
            System.out.println("все цифры числа одинаковы.");
        }

        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);

    }
}
