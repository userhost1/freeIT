package homework02;

// Дано целое число.
// Если оно является положительным, то прибавить к нему 1.
// Если отрицательным, то вычесть из него 2.
// Если нулевым, то заменить его на 10.
// Вывести полученное число

import java.util.Scanner;

public class task_02_03 {
    public static void main(String[] args) {

        System.out.println("Число");

        int number = new Scanner(System.in).nextInt();

        if (number > 0) {
            number++;
        } else if (number < 0) {
            number -= 2;
        } else {
            number = 10;
        }

        System.out.println(number);
    }
}
