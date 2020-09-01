package homework03;

//Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа различны?

import java.util.Random;

public class JB_chapter1_05 {
    public static void main(String[] args) {

        String number = String.valueOf(new Random().nextInt(8999) + 1000);
        boolean b = true;

        if (number.length() > 1) {

            marker:
            for (int i = 0; i < number.length() - 1; i++) {
                for (int j = i + 1; j < number.length(); j++) {
                    if (number.charAt(i) == number.charAt(j)) {
                        System.out.println(number);
                        System.out.println("Число имеет одинаковые цыфры: " + number.charAt(i));
                        b = false;
                        break marker;
                    }
                }
            }
        }

        if (b) {
            System.out.println("Все цифры числа " + number + " различный");
        }
    }

}