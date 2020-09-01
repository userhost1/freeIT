package homework02;

// В переменную записываете количество программистов.
// В зависимости от количества программистов необходимо вывести правильно окончание.
// Например: • 2 программиста • 1 программиста • 10 программистов • и т.д.

import java.util.Random;

public class Task_02_07 {
    public static void main(String[] args) {

        Random random = new Random();
        int x = random.nextInt(512);

        System.out.print(x);

        int l = x % 10;
        int l2 = x;

        if (l == 0 || l >= 5 || (l2 % 100 >= 11 && l2 % 100 <= 20)) {
            System.out.println(" программистов"); // x0 x5 x6 x7 x8 x9
        } else if (l == 1 && l2 != 11) {
            System.out.println(" программист"); // x1 excluded 11
        } else if (l >= 2 && l <= 4) {
            System.out.println(" программиста"); // x2 x3 x4
        } else {
            System.out.println("Что-то пошло не так!");
        }
    }
}
