package homework02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//        В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, "это однозначное положительное число".
//        Достаточно будет определить, является личисло однозначным, "двухзначным или трехзначным и более.

public class task_02_01 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String number = null;

        try {
            System.out.println("Введите пожалуйста число.");
            number = reader.readLine();
        } catch (IOException e) {
            System.out.println("Что-то пошло не так!");
            reader.close();
        }
        reader.close();

        if (isNumber(number) && (Integer.parseInt(number) >= 0)) {
            System.out.format("Это %d-значное положительное число.", number.length());
        } else if (isNumber(number) && (Integer.parseInt(number) < 0)) {
            System.out.format("Это %d-значное отрицательное число.", number.length() - 1);
        } else {
            System.out.println("Вы ввели не число");
        }

    }

    public static boolean isNumber(String number) {

        try {
            int i = Integer.parseInt(number);
        } catch (Exception e) {
            return false;
        }

        return true;
    }
}
