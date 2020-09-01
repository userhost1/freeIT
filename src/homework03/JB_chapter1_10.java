package homework03;

//  Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).

public class JB_chapter1_10 {
    public static void main(String[] args) {

        int factorial = (int) (Math.random() * 6 + 10);

        int result = 1;

        for (int i = 1; i <= factorial; i++) {
            result *= i;
        }

        System.out.println("Факториал числа " + factorial + " = " + result);

    }
}
