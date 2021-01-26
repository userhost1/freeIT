package homework12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//  Имеется файл с текстом, в котором присутствуют числа.
//  Найти все числа, распечатать, посчитать сумму,
//  убрать все повторяющиеся числа и снова распечатать.

public class Part3T34 {
    public static void main(String[] args) {

        int summ = 0;
        List<Integer> digits = new ArrayList<>();
        Set<Integer> setDigits = new TreeSet<>();

        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(new File("./src/homework12/demoWithText.txt")))) {

            int symbol;

            while ((symbol = reader.read()) != -1) {
                if (Character.isDigit((char) symbol)) {
                    digits.add(Integer.parseInt(String.valueOf((char) symbol)));
                    setDigits.add(Integer.parseInt(String.valueOf((char) symbol)));
                    summ += Integer.parseInt(String.valueOf((char) symbol));
                }
            }

        } catch (Exception e) {
            System.out.println("Что-то пошло не так!");
        }

        System.out.println("Найденные числа: " + digits.toString());
        System.out.println("Сумма чисел: " + summ);
        System.out.println("Вывод без повторений: " + setDigits.toString());

    }
}