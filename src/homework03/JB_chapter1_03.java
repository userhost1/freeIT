package homework03;

//          Имеется 4500 секунд.
//          Вывести в консоль содержащихся в этом количестве секунд:
//        А) минут + секунд,
//        В) часов + минут + секунд,
//        С) дней + часов + минут + секунд,

public class JB_chapter1_03 {
    public static void main(String[] args) {

        int totalSeconds = 4_500;
        int min = totalSeconds / 60;
        int secRest = totalSeconds % 60;
        int hour = min / 60;
        int hourRest = min % 60;
        int dayRest = hour % 24;
        int day = hour / 24;
        int weekRest = day % 7;
        int week = day / 7;

        System.out.println("В 4.500 секундах: ");
        System.out.println(min + " минут " + secRest + " секунды");
        System.out.println(hour + " часов " + hourRest + " минут " + secRest + " секунды");
        System.out.println(day + " дней " + dayRest + " часов " + hourRest + " минут " + secRest + " секунды");
        System.out.println(week + " недель " + weekRest + " дня " + dayRest + " часов " + hourRest + " минут " + secRest + " секунды");
    }
}
