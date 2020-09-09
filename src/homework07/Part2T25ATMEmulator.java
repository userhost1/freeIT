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
        System.out.println();

        atmEmulator.load(25, 2, 25);
        System.out.println();

        System.out.println(atmEmulator.getTotalSum());
        System.out.println();

        atmEmulator.withdraw(3080);
        System.out.println();

        System.out.println(atmEmulator.getTotalSum());

    }
}
