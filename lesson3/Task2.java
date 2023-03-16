//2. Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее арифметическое из этого списка.


package lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            arrayList.add(random.nextInt(50));
        }
        System.out.println("Исходный массив: " + arrayList);
        double average = getAverage(arrayList);

        System.out.println("Минимум: " +  Collections.min(arrayList));
        System.out.println("Максимум: " +  Collections.max(arrayList));
        System.out.println("Среднее арифметическое: " +  average);
    }
    public static double getAverage(ArrayList<Integer> list){
        double aver = 0;
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        aver = sum / list.size();
        return aver;
    }
}
