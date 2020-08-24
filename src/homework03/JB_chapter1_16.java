package homework03;

import java.util.Random;

//  Создать двухмерный квадратный массив, и заполнить его «бабочкой»,
//  т.е таким образом:
//  1 1 1 1 1
//  0 1 1 1 0
//  0 0 1 0 0
//  0 1 1 1 0
//  1 1 1 1 1

public class JB_chapter1_16 {
    public static void main(String[] args) {

        Random r = new Random();
        int size = r.nextInt(5) + 5;
        char arr[][] = new char[size][size];
        System.out.println("Massive size is " + size);

        for (int i = 0; i < arr.length - i; i++) {
            for (int j = i; j < arr.length - i; j++) {
                arr[i][j] = '*';
            }
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            for (int j = arr.length - i - 1; j < arr.length - (arr.length - i - 1); j++) {
                arr[i][j] = '*';
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
