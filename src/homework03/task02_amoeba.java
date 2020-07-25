package homework03;

public class task02_amoeba {
    public static void main(String[] args) {
//        2)Одноклеточная амеба каждые 3 часа делится на 2 клетки.
//          Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.

        int hours = 5;
        int amoeba = 1;

        for (; hours >= 3; hours -= 3) {
            amoeba *= 2;
        }
        System.out.println(amoeba);
    }


}
