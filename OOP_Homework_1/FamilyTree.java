package OOP_Homework_1;

import java.util.*;

import static java.lang.Integer.parseInt;

public class FamilyTree {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        People father = new People("Иван_Васильевич_Смирнов", "мужской", 45, "Юрист", true, 1, 0, 0, 2);
        People mother = new People("Анна_Романовна_Смирнова", "женский", 38, "Врач", true, 1, 1, 0, 2);
        People child1 = new People("Андрей_Иванович_Смирнов", "мужской", 14, "Школьник", false, 2, 0, 1, 0);
        People child2 = new People("Мария_Ивановна_Смирнова", "женский", 10, "Школьница", false, 1, 1, 0, 0);
        People uncle = new People("Станислав_Романович_Анисимов", "мужской", 23, "Инженер", false, 0, 0, 1, 0);
        Pets cat1 = new Cats("Кот", "Петруша", "мальчик", 5, "двор-кот");
        Pets dog1 = new Dogs("Пёсель", "Патрик", "мальчик", 10, "Чау-чау");
        ArrayList<People> familyTree = new ArrayList<>();
        ArrayList<Pets> petsTree = new ArrayList<>();
        Collections.addAll(familyTree, father, mother, child1, child2, uncle);
        Collections.addAll(petsTree, cat1, dog1);
/** Получение от пользователя информации о конкретном человеке и поиск в дереве совпадений */
        System.out.println("Добавим информацию о жене");
        father.setPartnerName(GetInfoForRelatives.getInfoForPartner(father.isMarried()));
        int count = 0;
        for (int i = 0; i < familyTree.size(); i++) {
            if (familyTree.get(i).getName().equals(father.getPartnerName())) {
                System.out.println("Подробнее о ней из информации семейного дерева");
                familyTree.get(i).showInfo();
                count += 1;
            }
        }
        if (count == 0) {
            System.out.println("В семейном дереве о ней пока нет информации");
        }
/** Получение от пользователя информации о человеке и поиск в дереве совпадений */
        System.out.println("Добавим информацию о детях");
        father.setChildName(GetInfoForRelatives.getInfoForRelatives(father.getCountChildren()));
        count = 0;
        for (int i = 0; i < familyTree.size(); i++) {
            for (int j = 0; j < father.getCountChildren(); j++) {
                if (familyTree.get(i).getName().equals(father.getChildName().get(j))) {
                    System.out.println("Подробнее о детях из информации семейного дерева");
                    familyTree.get(i).showInfo();
                    count += 1;
                }
            }
        }
        if (count == 0) {
            System.out.println("В семейном дереве о детях пока нет подробной информации");
        }
/** Вывод в консоль имеющейся информации о конкретном человеке */
        System.out.println("Дополненная инфа об отце");
        father.showInfo();
/** Ввод информации о питомце */
        System.out.println("Добавим информацию о питомце");
        child1.setPetName(GetInfoForPets.getInfoForPets(child1.getCountPet()));
        count = 0;
        for (int i = 0; i < petsTree.size(); i++) {
            for (int j = 0; j < child1.getCountPet(); j++) {
                if (petsTree.get(i).getName().equals(child1.getPetName().get(j))) {
                    System.out.println("Подробнее о питомце из базы");
                    petsTree.get(i).showInfo();
                    count += 1;
                }
            }
        }
        if (count == 0) {
            System.out.println("В базе о питомце пока нет информации");
        }

/** Рассчет зарплаты в рублях дяди Станислава в зависимости от получаемой валюты */
        Salary<String, Integer> salary = (n, m, x) -> ((n.contains(m)) ? (x * 89) : x);
        System.out.println("Введите зарплату дяди Станислава с указанием валюты (к примеру: 10_евро)");
        String answerUnit = input1.next();
        ArrayList<String> findNum = new ArrayList<>(List.of(answerUnit.split("_"))) ;
        Integer salFromUnit = parseInt(findNum.get(0));
        System.out.println("Зарплата в рублях: " + salary.calculateSalary(answerUnit, "евро", salFromUnit));
    }
}

