package homework07;

//  Создать класс и объекты описывающие Банкомат.
//  Набор купюр находящихся в банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20 50 100.
//  Сделать методы для добавления денег в банкомат.
//  Сделать функцию снимающую деньги. На вход передается сумма денег. На выход – булевское
//  значение (операция удалась или нет).
//  При снятии денег функция должна рапечатывать каким количеством купюр какого номинала выдается сумма.
//  Создать конструктор с тремя параметрами – количеством купюр.


public class part2_t25_Bankomat {

    public static void main(String[] args) {

        Bankomat bankomat = new Bankomat();

        bankomat.load(0, 16, 2);

        bankomat.getTotalSumma();

        bankomat.withdraw(970);


    }
}
