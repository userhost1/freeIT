package homework07;

public class Bankomat {

    private int by20;
    private int by50;
    private int by100;

    public String getTotalSumma() {

        return "Total summa in bankomat: " + ((by20 * 20) + (by50 * 50) + (by100 * 100)) +
                "\nby20: " + by20 +
                "\nby50: " + by50 +
                "\nby100: " + by100;
    }

    public int restOfMoney() {
        return (by20 * 20) + (by50 * 50) + (by100 * 100);
    }


    public boolean load(int by20, int by50, int by100) {

        if (by20 >= 0 && by50 >= 0 && by100 >= 0) {

            this.by20 += by20;
            this.by50 += by50;
            this.by100 += by100;

            return true;
        }
        return false;
    }

    public boolean withdraw(int summa) {

        int _100 = 0, _50 = 0, _20 = 0;


        if (summa > restOfMoney()) {
            System.out.println("Insufficient funds!");
            return false;
        } else if (summa == restOfMoney()) {
            _100 = by100;
            by100 -= _100;
            _50 = by50;
            by50 -= _50;
            _20 = by20;
            by20 -= _20;
            summa = 0;
        } else if (summa == restOfMoney() - 10) {
            System.out.println("Please choose a different amount. \nThere are no bills of the required denomination in the ATM");
            return false;
        } else if (summa % 100 == 50 && by50 == 0) {
            System.out.println("Please choose a different amount. \nThere are no bills of the required denomination in the ATM");
            return false;
        } else if (summa % 50 > 0 && (by20 == 0 || by50 == 0)) {
            System.out.println("Please choose a different amount. \nThere are no bills of the required denomination in the ATM");
            return false;
        } else if (summa < restOfMoney()) {

            if (summa / 100 <= by100 && summa >= 100) {
                _100 = summa / 100;
                by100 -= _100;
                summa -= 100 * _100;
            } else if (summa / 100 > by100) {
                _100 = by100;
                by100 -= _100;
                summa -= 100 * _100;
            }

            if (summa / 50 < by50 && summa >= 50) {
                _50 = summa / 50;
                by50 -= _50;
                summa -= 50 * _50;
            } else if (summa / 50 > by50 && summa >= 50) {
                _50 = by50;
                by50 -= _50;
                summa -= 50 * _50;
            }

            if (summa / 20 < by20) {
                if (summa % 20 == 10 && _50 >= 1) {
                    _50 -= 1;
                    by50 += 1;
                    summa += 50;

                    if (summa / 20 < by20) {
                        int i = summa / 20;
                        _20 += i;
                        by20 -= i;
                        summa -= i * 20;
                    }
                } else if (summa % 20 == 10 && _100 >= 1) {
                    _100 -= 1;
                    _50 = 1;
                    summa += 50;

                    if (summa / 20 < by20) {
                        int i = summa / 20;
                        _20 += i;
                        by20 -= i;
                        summa -= i * 20;
                    }

                } else if (summa % 20 == 0 && summa >= 20) {
                    _20 = summa / 20;
                    by20 -= _20;
                    summa -= 20 * _20;
                }
            }
        }


        if (summa != 0) {
            System.out.println("Что-то пошло не так!");
            return false;
        }

        System.out.println("You have got money: " + (100 * _100 + 50 * _50 + 20 * _20));
        if (_100 > 0) {
            System.out.println("by 100: " + _100);
        }
        if (_50 > 0) {
            System.out.println("by 50: " + _50);
        }
        if (_20 > 0) {
            System.out.println("by 20: " + _20);
        }
        return true;
    }
}
