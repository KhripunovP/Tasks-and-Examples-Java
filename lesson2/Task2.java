//2. Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.

package lesson2;

import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        WriteFile();
    }

    public static StringBuilder TestStrings() {
        StringBuilder sb = new StringBuilder();
        sb.append("TEST".repeat(100));

        return sb;
    }

    public static void WriteFile() {
        try {
            FileWriter f1 = new FileWriter("D:\\!Программирование\\Java\\!Java programs\\Tasks and HomeWorks\\First_lessons\\src\\main\\java\\lesson2\\Task2.txt");
            f1.write(String.valueOf(TestStrings()));
            f1.flush();
            System.out.print("Файл записан");
        } catch (IOException e) {
            System.out.print("Fail");
        }
    }
}
