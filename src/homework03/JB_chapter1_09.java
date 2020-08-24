package homework03;

//  Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма,
//  а произведение, т.е. факториал числа.

import java.lang.constant.Constable;
import java.util.Random;

public class JB_chapter1_09 {

    static int result = 1;

    public static void main(String[] args) {

        int number = new Random().nextInt(10);

        System.out.println("Факториал " + number + " = " + factorial(number));
    }

    static Constable factorial(int f) {

        if (f < 0) {
            return null;
        }

        if (f == 0) {
            return result;
        }

        if (f > 0) {
            result *= f;
            return factorial(--f);
        }

        return result;
    }
}
