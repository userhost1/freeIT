package homework12;

//  Проверка на цензуру:
//      Создаете 2 файла.
//      1 - й. Содержит исходный текст.
//      2 - й. Содержит слова недопустимые в тексте(black list).
//      Структура файла определите сами, хотите каждое слово на новой строке, хотите через запятую разделяйте,
//      ваша программа делайте как считаете нужным.

//      Задача:
//      Необходимо проверить проходит ли текст цензуру. Если в тексте не
//      встретилось ни одного недопустимого слова, то выводите сообщение о том что
//      текст прошёл проверку на цензуру. Если нет, то выводите соответствуюущее
//      сообщение, кол-во предложений не прошедших проверку и сами предложения
//      подлежащие исправлению.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class AdditionalTask_3 {

    private static int countSentences = 0;
    private static ArrayList<String> sentences = new ArrayList<>();


    public static void main(String[] args) {

        StringBuilder text = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader("./src/homework12/demoWithText.txt"))) {

            String line;

            while ((line = reader.readLine()) != null) {
                text.append(line);
            }

        } catch (IOException e) {
            System.out.println("Oops ошибочка подъехала при чтении: " + e);
        }

        StringTokenizer tokens = new StringTokenizer(text.toString(), ".!?:");

        while (tokens.hasMoreElements()) {
            String s = tokens.nextElement().toString();
            if (censor(s.toLowerCase().trim())) {
                sentences.add(s);
                countSentences++;
            }
        }

        System.out.println("Количество предложений к исправлению: " + countSentences);
        sentences.forEach(System.out::println);
    }

    public static boolean censor(String text) {

        try (BufferedReader reader = new BufferedReader(new FileReader("./src/homework12/demoCensor.txt"))) {

            String word;

            while ((word = reader.readLine()) != null) {
                if (text.contains(word.toLowerCase().trim())) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}
