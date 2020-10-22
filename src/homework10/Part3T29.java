package homework10;

//  Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
//  Удалить неудовлетворительные оценки из списка.

import java.util.ArrayList;
import java.util.List;

public class Part3T29 {
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            scores.add((int) (Math.random() * (- 10)) + 10);
        }

        System.out.println("ArrayList [before removing] " + scores);
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) < 3) {
                scores.remove(i);
                i--;
            }
        }
        System.out.println("ArrayList [after removing] " + scores);
    }
}
