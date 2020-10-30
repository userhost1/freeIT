package homework12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

//  Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.

public class Part3T33 {
    public static void main(String[] args) throws IOException {

        try (BufferedReader reader = new BufferedReader(new FileReader("e:\\demoWithText.txt"))) {

            String line;
            StringBuilder text = new StringBuilder();
            int words = 0, punctuationMarks = 0;

            while ((line = reader.readLine()) != null) {
                text.append(line);
            }

            StringTokenizer tokens = new StringTokenizer(text.toString(), ".,!?-—;:(){}<>«» \r\n\t\"");
            while (tokens.hasMoreElements()) {
//              System.out.println(tokens.nextElement() + " ");
                words++;
            }

            char[] p = {'.', ',', '!', '?', '-', '—', ';', ':'};

            for (int i = 0; i < text.toString().length(); i++) {
                char c = text.toString().charAt(i);
                for (char symbol : p) {
                    if (symbol == c) {
                        punctuationMarks++;
                    }
                }
            }
            System.out.println("Words: " + words);
            System.out.println("Punctuation Marks: " + punctuationMarks);

        } catch (Exception e) {
            System.out.println("Что-то пошло не так!");
        }
    }
}
