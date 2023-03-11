//1. Напишите метод, который принимает на вход строку (String) и
//        определяет является ли строка палиндромом (возвращает boolean значение).

package lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = input1.next();
        boolean result = Palindrome(word);
        System.out.print(result);
    }

    public static Boolean Palindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                System.out.println("Слово не является палиндромом");
                return false;
            }
        }
        System.out.println("Слово палиндром");
        return true;
    }
}
