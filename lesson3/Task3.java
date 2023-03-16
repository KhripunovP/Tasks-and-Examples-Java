//Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.

package lesson3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.print("Введите количество элементов списка: ");
        int length = input1.nextInt();

        for (int i = 0; i < length; i++) {
            System.out.print("Введите текст: ");
            arrayList.add(input1.next());
        }

        System.out.println("Начальный список: " + arrayList);

        int n = 0;
        for (int i = 0; i < length; i++) {
            try {
                n = Integer.parseInt(arrayList.get(i));
                arrayList.remove(i);
                i = i - 1;
                length = length - 1;
            } catch (NumberFormatException e) {
                System.out.println(arrayList.get(i) + " не является целым числом");
            }
        }
        System.out.println("Конечный список после удаления целых чисел: " + arrayList);
    }
}
