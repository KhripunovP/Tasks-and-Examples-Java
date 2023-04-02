package OOP_Homework_1;

import java.util.ArrayList;
import java.util.Scanner;

public interface GetInfoForRelatives {
    Scanner input1 = new Scanner(System.in);

    static ArrayList<String> getInfoForRelatives(int count) {
        ArrayList<String> relatives = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            System.out.println("Введите ФИО человека:");
            relatives.add(input1.next());
        }
        return relatives;
    }

    static String getInfoForPartner(boolean isMarried) {
        if (isMarried == true) {
            System.out.println("Введите ФИО жены/мужа:");
            String wifeOrHusb = input1.next();
            return wifeOrHusb;
        }
        else {
            String wifeOrHusb = "холост";
            return wifeOrHusb;
        }
    }
}
