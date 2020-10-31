package homework12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//  Имеется файл с текстом, в котором присутствуют числа. Найти все числа,
//  распечатать, посчитать сумму, убрать все повторяющиеся числа и снова
//  распечатать.

public class Part3T34 {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("e:\\demoWithText.txt"))) {

            String line;
            StringBuilder text = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                text.append(line);
            }

            List<Integer> digits = new ArrayList<>();
            Set<Integer> setDigits = new TreeSet<>();
            int countDigits = 0;

            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (Character.isDigit(c)) {
                    digits.add(Integer.parseInt(String.valueOf(c)));
                    setDigits.add(Integer.parseInt(String.valueOf(c)));
                    countDigits += Integer.parseInt(String.valueOf(c));
                }
            }
            System.out.println(digits.toString());
            System.out.println("Сумма чисел: " + countDigits);
            System.out.println("Вывод без повторений: " + setDigits.toString());


        } catch (Exception e) {
            System.out.println("Что-то пошло не так!");
        }
    }
}
