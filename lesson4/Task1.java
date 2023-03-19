//1. Реализовать консольное приложение, которое:
//        Принимает от пользователя и “запоминает” строки.
//        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//        Если введено revert, удаляет предыдущую введенную строку из памяти.

package lesson4;

import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        LinkedList<String> phraseList = new LinkedList<>();
        boolean flag = true;
        while (flag) {
            System.out.print("Введите 'print', если хотите добавить строки, или 'revert', если хотите удалить последнюю введенную строку: ");
            String user = input1.next();
            switch (user) {
                case "print":
                    addStringToList(phraseList);
                    System.out.println(phraseList);
                    break;
                case "revert":
                    revertStringFromList(phraseList);
                    System.out.println(phraseList);
                    break;
            }
            System.out.println("хотите ввести еще действие? (y/n): ");
            String decision = input1.next();
            if (decision.equals("n")) {
                flag = false;
                System.out.println("Пока!");
            }
        }
    }

    public static void addStringToList(LinkedList<String> list) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Введите текст: ");
        list.addFirst(input1.next());
    }

    public static void revertStringFromList(LinkedList<String> list) {
        System.out.println("Удалена первая по порядку строка");
        list.removeFirst();
    }
}