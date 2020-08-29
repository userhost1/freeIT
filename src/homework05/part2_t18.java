package homework05;

// Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.

public class part2_t18 {
    public static void main(String[] args) {
        String someText = "Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.".trim();

        int count = 0;

        char[] chars = {'.', ',', '!', '?', '-'};

        for (char symbol : someText.toCharArray()) {
            for (char c : chars) {
                if (symbol == c) {
                    count++;
                }
            }
        }

        System.out.format("Текст содержит %d знака(ов) препинания", count);
    }
}
