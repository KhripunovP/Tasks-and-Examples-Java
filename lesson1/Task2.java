package lesson1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Введите год, который Вас интересует: ");
        int year = input1.nextInt();
        boolean answer = detectLeapYear(year);
        System.out.printf("Високосный? %s", answer);
    }

    public static boolean detectLeapYear (int year){
        boolean detection = false;
        if ((0 <= year) && (year < 100)) {
            if (year % 4 == 0) {
                detection = true;
            }
        }
        if ((100 <= year) && (year < 400)) {
            if ((year % 4 == 0) && (year % 100 != 0)) {
                detection = true;
            }
        }
        if (400 <= year) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                detection = true;
            }
        }
        return detection;
    }
}

