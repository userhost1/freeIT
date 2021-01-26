package homework12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//  В исходном файле находятся слова, каждое слово на новой стороке.
//  После запуска программы должен создать файл, который будет содержать в себе только палиндромы.

public class AdditionalTask_1 {
    public static void main(String[] args) throws IOException {

        ArrayList<String> palindromList = new ArrayList<>();

        char[] punctuationMarks = {'.', ',', '!', '?', ';', ':'};

        try (BufferedReader reader = new BufferedReader(new FileReader("./src/homework12/demoWords.txt"))) {
            String word = "";

            while ((word = reader.readLine()) != null) {
                word = word.trim().toLowerCase();

                //      cycle for removing punctuation symbols
                for (char c : punctuationMarks) {
                    if (word.endsWith(String.valueOf(c))) {
                        word = word.replace(String.valueOf(c), "");
                    }
                }

                if (word.length() > 2 && isPalindrom(word)) {
                    palindromList.add(word);
                }
            }

        } catch (IOException e) {
            System.out.println("Oops ошибочка подъехала: " + e);
        }
        System.out.println("Палиндромы: " + palindromList.toString());
    }

    //      А роза Азора - эта проверка не в счет!!!
    private static boolean isPalindrom(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.length() >= 2)
                if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                    return false;
                }
        }
        return true;
    }

}
