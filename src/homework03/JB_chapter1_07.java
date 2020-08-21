package homework03;

import java.util.Random;

//  Имеется прямоугольное отверстие размерами a и b, определить,
//  можно ли его полностью закрыть круглой картонкой радиусом r.

public class JB_chapter1_07 {
    public static void main(String[] args) {

        Random random = new Random();

        int a = random.nextInt(10);
        int b = random.nextInt(10);
        int r = random.nextInt(10);

        System.out.println("Даны стороны треугольника А " + a + " и В " + b);
        double g = Math.sqrt(a * a + b * b);
        System.out.println("Гипотенуза равна: " + g);
        System.out.println("Радиус окружности равен : " + r);
        if (g / 2 <= r) {
            System.out.println("Возмодно закрыть отверстие.");
        } else {
            System.out.println("Невозможно закрыть отверстие.");
        }
    }
}
