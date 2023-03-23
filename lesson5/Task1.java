//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

package lesson5;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> phoneBook = new HashMap<>();
        phoneBook.put("Василий Сервис", new ArrayList<>(Arrays.asList("+79112223344", "+79111234567", "+79311234567")));
        phoneBook.put("Аня Школа", new ArrayList<>(Arrays.asList("+79214445566", "+79600334411")));
        phoneBook.put("Иван Петров", new ArrayList<>(Arrays.asList("+79114554444")));
        phoneBook.put("Ирина Работа", new ArrayList<>(Arrays.asList("+79213344556", "+79123984455")));
        phoneBook.put("Виктория Панфилова", new ArrayList<>(Arrays.asList("+79650010022")));
        phoneBook.put("Начальник Не бери", new ArrayList<>(Arrays.asList("+79125554433")));

        for (String key : phoneBook.keySet()) {
            System.out.println(key + " - " + phoneBook.get(key));
        }
    }
}
