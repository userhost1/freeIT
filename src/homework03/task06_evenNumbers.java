package homework03;

public class task06_evenNumbers {
    public static void main(String[] args) {
//          6)Напишите программу вывода всех четных чисел от 2 до 100 включительно
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
