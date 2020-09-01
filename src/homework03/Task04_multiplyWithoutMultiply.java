package homework03;

public class Task04_multiplyWithoutMultiply {
    public static void main(String[] args) {

        int a = 2, b = 25;
        int result = 0;

        while (b > 0) {
            result += a;
            b--;
        }
        System.out.println(result);

    }
}