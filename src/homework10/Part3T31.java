package homework10;

//  Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
//  Найти самую высокую оценку с использованием итератора.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Part3T31 {
    public static void main(String[] args) {

        List<Integer> scores = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            scores.add((int) (Math.random() * (-10)) + 10);
        }
        System.out.println("scores: " + scores);

        int highestScore = Integer.MIN_VALUE;

        Iterator iterator = scores.iterator();
        while (iterator.hasNext()) {
            int score = (int) iterator.next();
            if (highestScore < score) {
                highestScore = score;
            }
        }
        System.out.println("highest score: " + highestScore);
    }
}
