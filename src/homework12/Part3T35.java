package homework12;

//  Записать в двоичный файл 20 случайных чисел.
//  Прочитать записанный файл, распечатать числа и их среднее арифметическое.

import java.io.*;

public class Part3T35 {
    public static void main(String[] args) {

        int count = 0, summa = 0;

        try (DataOutputStream dataWriter = new DataOutputStream(new FileOutputStream("test.txt"));
             DataInputStream dataReader = new DataInputStream(new FileInputStream("test.txt"))) {

            for (int i = 1; i <= 20; i++) {
                dataWriter.writeInt(i);
                dataWriter.flush();
            }
            dataWriter.close();

            while (true) {
                int number = dataReader.readInt();
                count++;
                summa += number;
                System.out.print(number + " ");
            }

        } catch (IOException e) {
            System.out.println();
        }

        System.out.println("count: " + count);
        System.out.println("summa: " + summa);
        System.out.println("Среднее арифметическое: " + ((double) summa / count));
    }
}
