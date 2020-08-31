package homework05;

//  Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
//  которых есть параметры, например <p id=”p1”>, и замену их на простые теги
//  абзацев <p>.

public class part2_t23 {
    public static void main(String[] args) {

        String text = "Привет. в данном тексте не находится совершенно никакой информации. <p id=”p1”> Он был создан <pip-pop-pup> специально как <pol> тестовая строка <p> <programming is cool. it`is the only thing for your brain work with pleasure>";

        System.out.println("Unmodified text: " + text);
        System.out.println("Modified text: " + text.replaceAll("(<p[^>]*>)", "<p>"));
    }
}
