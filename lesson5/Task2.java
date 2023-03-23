//Дан список сотрудников. Написать программу,
// которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

package lesson5;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Map<String, String> colleagues = new HashMap<>();
        Map<String, Integer> calculator = new TreeMap<>();

        colleagues.put("Иванов", "Иван");
        colleagues.put("Петрова", "Светлана");
        colleagues.put("Белова", "Кристина");
        colleagues.put("Мусина", "Анна");
        colleagues.put("Крутова", "Анна");
        colleagues.put("Юрин", "Иван");
        colleagues.put("Лыков", "Петр");
        colleagues.put("Чернов", "Павел");
        colleagues.put("Чернышов", "Петр");
        colleagues.put("Федорова", "Мария");
        colleagues.put("Светлова", "Марина");
        colleagues.put("Савина", "Мария");
        colleagues.put("Рыкова", "Мария");
        colleagues.put("Лугова", "Марина");
        colleagues.put("Владимирова", "Анна");
        colleagues.put("Мечников", "Иван");
        colleagues.put("Петин", "Петр");
        colleagues.put("Ежов", "Иван");

        System.out.println("Список сотрудников:");
        for (String key : colleagues.keySet()) {
            System.out.println(key + " " + colleagues.get(key));
        }

        for (String key : colleagues.keySet()) {
            if (calculator.containsKey(colleagues.get(key))) {
                calculator.put(colleagues.get(key), calculator.get(colleagues.get(key)) + 1);
            } else {
                calculator.put(colleagues.get(key), 1);
            }
        }

        System.out.println("Рейтинг популярности имен:");
        calculator.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).forEach(System.out::println);
    }
}
