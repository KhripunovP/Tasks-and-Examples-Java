import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class shop {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Toys toy1 = new Toys(1, "кукла_Барби_1", 100, 20);
        Toys toy2 = new Toys(2, "кукла_Кен", 100, 10);
        Toys toy3 = new Toys(3, "Бэтмобиль_на_радио_управлении", 20, 20);
        Toys toy4 = new Toys(4, "настольная_игра_Тотем", 50, 50);
        Toys toy5 = new Toys(5, "Лего_Звездные_войны", 100, 20);
        Toys toy6 = new Toys(6, "Раскраска_детская_Супергерои", 200, 50);
        Toys toy7 = new Toys(7, "Маска_резиновая_Халк", 50, 50);
        Toys toy8 = new Toys(8, "Nurf_дробовик", 25, 50);
        Toys toy9 = new Toys(9, "Книжка_детская_7_Чудес_Света", 100, 50);
        Toys toy10 = new Toys(10, "Кукла_Барби_2", 50, 30);
        ArrayList<Toys> startToys = new ArrayList<>();
        Collections.addAll(startToys, toy1, toy2, toy3, toy4, toy5, toy6, toy7, toy8, toy9, toy10);

        System.out.println("Добрый день! Это магазин игрушек. Ниже представлен наш ассортимент");
        for (int i = 0; i < startToys.size(); i++) {
            startToys.get(i).showInfo();
        }

        boolean flag = true;
        while (flag) {
            System.out.println("Что вы хотите сделать?" + '\n' +
                    "(1) Посмотреть каталог" + '\n' +
                    "(2) Добавить игрушку" + '\n' +
                    "(3) Изменить шансы выйгрыша какой-нибудь игрушки" + '\n' +
                    "(4) Поучаствовать в розыгрыше" + '\n' +
                    "(5) Прочитать список выпавших игрушек" + '\n' +
                    "(6) Выйти" + '\n');
            String user = input1.next();
            switch (user) {
                case "1":
                    for (int i = 0; i < startToys.size(); i++) {
                        startToys.get(i).showInfo();
                    }
                    break;
                case "2":
                    /** Метод добавления новых игрушек **/
                    Toys newToy = new Toys(0, "", 0, 0);
                    newToy = newToy.addNewToys(startToys);
                    startToys.add(newToy);
                    for (int i = 0; i < startToys.size(); i++) {
                        startToys.get(i).showInfo();
                    }
                    break;
                case "3":
                    /** Метод изменения вероятности выпадания игрушки при розыгрыше призов **/
                    Toys changeObj = new Toys(0, "", 0, 0);
                    System.out.print("Выберите фильтр, который хотите применить:" + '\n' +
                            "(1) id" + '\n' +
                            "(2) Название" + '\n');
                    String user2 = input1.next();
                    switch (user2) {
                        case "1":
                            changeObj = changeObj.searchToysId(startToys);
                            changeObj.changeFreq();
                            System.out.println("Новые данные игрушки:");
                            changeObj.showInfo();
                            break;
                        case "2":
                            changeObj.searchToysName(startToys);
                            changeObj.changeFreq();
                            System.out.println("Новые данные игрушки:");
                            changeObj.showInfo();
                    }
                    break;
                case "4":
                    /** Метод розыгрыша призов **/
                    Toys testObj = new Toys(0, "", 0, 0);
                    testObj = testObj.game(startToys);
                    testObj.writingFile(testObj);
                    break;

                case "5":
                    /** Чтение файла **/
                    Toys readObj = new Toys(0, "", 0, 0);
                    readObj.readingFile();
                    break;

                case "6":
                    System.out.println("До свидания! Приходите к нам еще!");
                    flag = false;
            }
        }
    }
}

