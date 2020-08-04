package homework05;

import java.util.Scanner;

public class GameXO {

    static String[][] xo = new String[3][3];

    static {
        for (int i = 0; i < xo.length; i++) {
            for (int j = 0; j < xo[i].length; j++) {
                xo[i][j] = "_";
            }
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int position = 0;

        rule();

        while (hasMoreEmptySpace()) {

            gameField();
            System.out.println("Ходят крестики-[X]. 1-9");
            position = in.nextInt();

            while ((position < 1 || position > 9) || (checkFreePosition(position))) {
                System.out.println("Неверный ход! Ходят крестики-[X]. 1-9");
                position = in.nextInt();
            }

            numOfPosition(position, "X");

            if (hasWinner("X")) {
                System.out.println("Выиграли крестики-[X]");
                gameField();
                break;
            }

            //проверочка после последнего хода :)
            if (!hasMoreEmptySpace()) {
                gameField();
                System.out.println("НИЧЬЯ!");
                break;
            }

            gameField();
            System.out.println("Ходят нолики-[O]. 1-9");
            position = in.nextInt();

            while ((position < 1 || position > 9) || (checkFreePosition(position))) {
                System.out.println("Неверный ход! Ходят нолики-[O]. 1-9");
                position = in.nextInt();
            }

            numOfPosition(position, "O");

            if (hasWinner("O")) {
                System.out.println("Выиграли нолики-[O]");
                gameField();
                break;
            }
        }
        in.close();
    }

    static boolean hasMoreEmptySpace() {

        for (String[] line : xo) {
            for (String s : line) {
                if (s.equals("_")) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean hasWinner(String symbol) {

//        s s s
//        _ _ _
//        _ _ _
        if ((xo[0][0].equals(symbol) && xo[0][1].equals(symbol) && xo[0][2].equals(symbol)) ||
//        _ _ _
//        s s s
//        _ _ _
                (xo[1][0].equals(symbol) && xo[1][1].equals(symbol) && xo[1][2].equals(symbol)) ||
//        _ _ _
//        _ _ _
//        s s s
                (xo[2][0].equals(symbol) && xo[2][1].equals(symbol) && xo[2][2].equals(symbol)) ||
//        s _ _
//        s _ _
//        s _ _
                (xo[0][0].equals(symbol) && xo[1][0].equals(symbol) && xo[2][0].equals(symbol)) ||
//        _ s _
//        _ s _
//        _ s _
                (xo[0][1].equals(symbol) && xo[1][1].equals(symbol) && xo[2][1].equals(symbol)) ||
//        _ _ s
//        _ _ s
//        _ _ s
                (xo[0][2].equals(symbol) && xo[1][2].equals(symbol) && xo[2][2].equals(symbol)) ||
//        s _ _
//        _ s _
//        _ _ s
                (xo[0][0].equals(symbol) && xo[1][1].equals(symbol) && xo[2][2].equals(symbol)) ||
//        _ _ s
//        _ s _
//        s _ _
                (xo[0][2].equals(symbol) && xo[1][1].equals(symbol) && xo[2][0].equals(symbol))) {
            return true;
        }
        return false;
    }

    static void numOfPosition(int i, String team) {
        switch (i) {

            case 1:
                xo[0][0] = team;
                break;
            case 2:
                xo[0][1] = team;
                break;
            case 3:
                xo[0][2] = team;
                break;
            case 4:
                xo[1][0] = team;
                break;
            case 5:
                xo[1][1] = team;
                break;
            case 6:
                xo[1][2] = team;
                break;
            case 7:
                xo[2][0] = team;
                break;
            case 8:
                xo[2][1] = team;
                break;
            case 9:
                xo[2][2] = team;
                break;
            default:
                System.out.println("Что-то пошло не так!");
        }
    }

    static boolean checkFreePosition(int i) {

        boolean flag = false;

        switch (i) {

            case 1:
                if (!xo[0][0].equals("_")) {
                    flag = true;
                }
                break;
            case 2:
                if (!xo[0][1].equals("_")) {
                    flag = true;
                }
                break;
            case 3:
                if (!xo[0][2].equals("_")) {
                    flag = true;
                }
                break;
            case 4:
                if (!xo[1][0].equals("_")) {
                    flag = true;
                }
                break;
            case 5:
                if (!xo[1][1].equals("_")) {
                    flag = true;
                }
                break;
            case 6:
                if (!xo[1][2].equals("_")) {
                    flag = true;
                }
                break;
            case 7:
                if (!xo[2][0].equals("_")) {
                    flag = true;
                }
                break;
            case 8:
                if (!xo[2][1].equals("_")) {
                    flag = true;
                }
                break;
            case 9:
                if (!xo[2][2].equals("_")) {
                    flag = true;
                }
                break;
            default:
                flag = true;
        }
        return flag;
    }

    static void rule() {
        System.out.println("1 2 3" +
                "\n4 5 6" +
                "\n7 8 9" +
                "\nПозиция хода");
    }

    static void gameField() {
        System.out.println(xo[0][0] + " " + xo[0][1] + " " + xo[0][2] +
                "\n" + xo[1][0] + " " + xo[1][1] + " " + xo[1][2] +
                "\n" + xo[2][0] + " " + xo[2][1] + " " + xo[2][2]);
    }
}
