package homework03;

public class Task05_inchTable {
    public static void main(String[] args) {
//        5)Напишите программу печати таблицы перевода расстояний из дюймов всантиметры для значений длин от 1 до 20 дюймов.
//          1 дюйм = 2,54 см

        double inch = 2.54;
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " дюйм(а\\ов) = " + i * inch);
        }

    }
}
