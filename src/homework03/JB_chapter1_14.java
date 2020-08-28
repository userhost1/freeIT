package homework03;

import java.util.Random;

//  Создать массив, заполнить его случайными элементами, распечатать,
//  перевернуть, и снова распечатать (при переворачивании нежелательно создавать еще один массив).

public class JB_chapter1_14 {
    public static void main(String[] args) {

        Random r = new Random();
        int rNum = r.nextInt(5) + 5;
        int iArr[] = new int[rNum];
        int j, num = 0;

        System.out.println("Original Array:");
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = num;
            System.out.print(iArr[i] + " ");
            num++;
        }
        System.out.println();
        System.out.println("Reversed Array:");

        for (int i = 0; i < iArr.length / 2; i++) {
            j = iArr[i];
            iArr[i] = iArr[iArr.length - i - 1];
            iArr[iArr.length - i - 1] = j;
        }

        for (int i = 0; i < iArr.length; i++) {
            System.out.print(iArr[i] + " ");
        }

        System.out.println();
    }
}
