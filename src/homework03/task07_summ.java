package homework03;

public class task07_summ {
    public static void main(String[] args) {
//        7)Напишите программу, определяющую сумму всех нечетных чисел от 1до 99
        int result = 0;
        for (int i = 1; i < 100; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
