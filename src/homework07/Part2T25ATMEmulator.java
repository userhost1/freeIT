package homework07;

//  Создать класс и объекты описывающие Банкомат.
//  Набор купюр находящихся в банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20 50 100.
//  Сделать методы для добавления денег в банкомат.
//  Сделать функцию снимающую деньги. На вход передается сумма денег. На выход – булевское
//  значение (операция удалась или нет).
//  При снятии денег функция должна рапечатывать каким количеством купюр какого номинала выдается сумма.
//  Создать конструктор с тремя параметрами – количеством купюр.


public class Part2T25ATMEmulator {

    public static void main(String[] args) {

        ATMEmulator atmEmulator = new ATMEmulator();

        atmEmulator.load(1, 1, 10);

        System.out.println(atmEmulator.getTotalSum());

        atmEmulator.withdraw(330);

        System.out.println(atmEmulator.getTotalSum());

    }
}