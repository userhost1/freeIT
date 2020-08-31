package homework05;

//  Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
//  записаных по правилам Java, с помощью регулярных выражений и вывести их на
//  страницу.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class part2_t22 {
    public static void main(String[] args) {

        String text = "Для написания регулярного выражения используются буквенные и цифровые символы (0x1fa128256), а также метасимволы – символы(0x512ff1698), имеющие специальное значение в синтаксисе регулярных выражений";
        Pattern pattern = Pattern.compile("(0[X|x][0-9a-fA-F]{1,16})");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
