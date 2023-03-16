//Пусть дан произвольный список целых чисел,
// удалить из него четные числа (в языке уже есть что-то готовое для этого)


package lesson3;

import java.util.ArrayList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(50));
        }
        System.out.println("Исходный массив: " + arrayList);

        arrayList.removeIf(x -> x % 2 == 0);
        System.out.println("После удаления четных чисел: " + arrayList);
    }
}
