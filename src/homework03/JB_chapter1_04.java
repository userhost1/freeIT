package homework03;

//Определить число, полученное выписыванием в обратном порядке цифр любого 4-х значного натурального числа n.

import java.util.Random;

public class JB_chapter1_04 {
    public static void main(String[] args) {

        int number = new Random().nextInt(8999) + 1000;

        System.out.println("Original number: " + number);

        String s = String.valueOf(number);

        String newNumber = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            newNumber += c;
            System.out.println("New number: " + newNumber);
        }

        int i = Integer.parseInt(newNumber);

        System.out.println("Reversed number: " + i);
    }
}
