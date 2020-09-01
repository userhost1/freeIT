package homework03;

public class Task03_1plus2plus4 {
    public static void main(String[] args) {
//        3)Вычислить: 1+2+4+8+...+256

        int result = 0;
        int i = 1;
        while (i <= 256) {
            result += i;
            i *= 2;
        }
        System.out.println(result);
    }
}
