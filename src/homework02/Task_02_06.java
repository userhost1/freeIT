package homework02;

import java.util.Random;

public class Task_02_06 {
    public static void main(String[] args) {

        int a = new Random().nextInt();
        int b = new Random().nextInt();

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        if (a < b) {
            System.out.println("a < b");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("Числа равны!");
        }
    }
}
