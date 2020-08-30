package homework03;

import java.util.Random;

//  Создайте число.
//  Определите, является ли число трехзначным.
//  Определите, является ли его последняя цифра семеркой.
//  Определите, является ли число четным.

public class JB_chapter1_06 {
    public static void main(String[] args) {

        int number = new Random().nextInt(1000);

        System.out.println(number);

        if (String.valueOf(number).length() == 3) {
            System.out.println("Число является 3-х значным.");
        } else {
            System.out.println("Число не является 3-х значным.");
        }

        if (String.valueOf(number).equals("7")) {
            System.out.println("Последняя цифра числа является 7.");
        }else {
            System.out.println("Последняя цифра числа не является 7.");
        }

        if (number % 2 ==0){
            System.out.println("Число является четным.");
        }else {
            System.out.println("Число не является четным.");
        }

    }
}
