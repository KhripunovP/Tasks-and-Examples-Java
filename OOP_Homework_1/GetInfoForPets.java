package OOP_Homework_1;

import java.util.ArrayList;
import java.util.Scanner;

public interface GetInfoForPets {
    Scanner input1 = new Scanner(System.in);
    /** Метод используется для получения от пользователя информации о дамашнем питомце конкретного человека */
    static ArrayList<String> getInfoForPets(int count){
        ArrayList<String> pets = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            System.out.println("Введите кличку домашнего питомца");
            pets.add(input1.next());
        }
        return pets;
    }
}
