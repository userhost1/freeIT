package homework12;

//  Текстовый файл содержит текст.
//  После запуска программы в другой файл должны записаться только те предложения в которых от 3-х до 5-ти слов.
//  Если в предложении присутствует слово-палиндром, то не имеет значения какое кол-во слов в предложении, оно попадает в новый файл.

//  Пишем все в ООП стиле.
//  Создаём класс TextFormater в котором два статических метода:
//        1) Метод принимает строку и возвращает кол-во слов в строке.
//        2) Метод принимает строку и проверяет есть ли в строке слово-палиндром.
//      Если есть возвращает true, если нет false

//        В main считываем файл.
//        Разбиваем текст на предложения. Используя методы класса TextFormater.
//        Определяем подходит ли нам предложение.
//        Если подходит добавляем его в новый файл

import java.io.*;
import java.util.StringTokenizer;

public class AdditionalTask_2 {
    public static void main(String[] args) {

        StringBuilder text = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader("./src/homework12/AdditionalTask_2_DEMO.txt"))) {

            String line;

            while ((line = reader.readLine()) != null) {
                text.append(line);
            }

        } catch (IOException e) {
            System.out.println("Oops! Ошибочка при чтении: " + e);
        }

        StringTokenizer tokens = new StringTokenizer(text.toString(), ".!?:");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./src/homework12/AdditionalTask_2_DEMO_NEW.txt"))) {
            while (tokens.hasMoreElements()) {

                String element = tokens.nextElement().toString().trim();

                if ((TextFormater.countWords(element) >= 3 && TextFormater.countWords(element) <= 5) || TextFormater.hasPalindrom(element)) {
                    writer.write(element + ".\n");
                    writer.flush();
                }

            }
        } catch (Exception e) {
            System.out.println("Oops! Ошибочка при записи: " + e);
        }

    }

    public static class TextFormater {

        public static int countWords(String line) {
            return new StringTokenizer(line).countTokens();
        }

        public static boolean hasPalindrom(String text) {

            StringTokenizer tokenizer = new StringTokenizer(text, ".,!?-—;:(){}<>«» \r\n\t\\");

            while (tokenizer.hasMoreElements()) {
                String word = tokenizer.nextToken().toLowerCase();
                if (word.length() >= 2 && isPalindrom(word)) {
                    return true;
                }
            }
            return false;
        }
    }

    private static boolean isPalindrom(String word) {
        String s = word.toLowerCase().trim();
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != word.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
