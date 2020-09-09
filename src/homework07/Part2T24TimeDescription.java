package homework07;

//  Создать класс и объекты описывающие промежуток времени.
//  Сам промежуток в классе должен задаваться тремя свойствами: секундами, минутами, часами.
//  Сделать методы для получения полного количества секунд в объекте и сравнения двух объектов (метод должен работать аналогично compareTo в строках).
//  Создать два конструктора: получающий общее количество секунд, и часы, минуты и секунды по отдельности.
//  Сделать метод для вывода данных.

public class Part2T24TimeDescription {
    public static void main(String[] args) {

        TimeDescription time1 = new TimeDescription(10_800);
        System.out.println(time1.getAllSeconds());
        System.out.println(time1.getHoursMinutesSeconds());

        TimeDescription time2 = new TimeDescription(27, 95, 771);
        System.out.println(time2.getAllSeconds());
        System.out.println(time2.getHoursMinutesSeconds());

        System.out.println("time1.compareTo(time2)" + time1.compareTo(time2));
    }
}

