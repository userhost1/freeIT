package homework03;

import java.util.Random;

public class JB_chapter1_08 {
    public static void main(String[] args) {

        Random random = new Random();
        int x = random.nextInt(30);
        System.out.print(x);
        int l = x % 10;
        int l2 = x;

        if (l == 0 || l >= 5 || (l2 % 100 >= 11 && l2 % 100 <= 20)) {
            System.out.println(" рублей"); // x0 x5 x6 x7 x8 x9
        } else if (l == 1 && l2 != 11) {
            System.out.println(" рубль"); // x1 excluded 11
        } else if (l >= 2 && l <= 4) {
            System.out.println(" рубля"); // x2 x3 x4
        } else {
            System.out.println("Что-то пошло не так!");
        }

    }
}
