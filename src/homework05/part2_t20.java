package homework05;

//   Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.

public class part2_t20 {

    public static char[] symbols = {'.', ',', '-', ':', ';', '?', '!'};

    public static void main(String[] args) {

        String text = "Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.";

        String[] words = text.split("[\\s\\t\\n\\r\\f]");

        for (int i = 0; i < words.length; i++) {

            words[i] = washingMachineForWord(words[i]);

            System.out.print(words[i].charAt(words[i].length() - 1));
        }
    }

    public static String washingMachineForWord(String word) {

        for (char c : symbols) {
            if (c == word.charAt(word.length() - 1)) {
                return washingMachineForWord(word.substring(0, (word.length() - 1)).toLowerCase());
            }
        }

        return word;
    }
}