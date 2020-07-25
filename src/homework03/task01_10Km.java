package homework03;

public class task01_10Km {
    public static void main(String[] args) {
//        1)Начав тренировки, спортсмен в первый день пробежал 10 км.
//          Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
//          Какой суммарный путь пробежит спортсмен за 7 дней?

        double distance = 10.0;
        double result = distance;

        for (int i = 0; i < 6; i++) {
            distance += distance / 10;
            result += distance;
        }
        System.out.println("Суммарный путь:" + result + "км:");
    }
}
