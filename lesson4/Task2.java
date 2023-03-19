//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package lesson4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        LinkedList<String> phraseList = new LinkedList<>();
        LinkedList<String> reversePhraseList = new LinkedList<>();
        Collections.addAll(phraseList, "1-apple", "2-orange", "3-banana", "4-tomato", "5-strawberry", "6-melon");
        System.out.println("Начальный список: " + phraseList);
        for (int i = phraseList.size()-1; i >= 0; i--) {
            reversePhraseList.addLast(phraseList.get(i));
        }
        System.out.println("Перевернутый список: " + reversePhraseList);
    }
}
