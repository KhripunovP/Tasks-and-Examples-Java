package lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LaptopShop {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Laptop id001 = new Laptop("Acer", "Extensa EX215-31-C3FF", "15.6", 4, 128, "Intel Celeron N4020", "black");
        Laptop id002 = new Laptop("Apple", "MacBook Air", "13.3", 8, 256, "Apple M1", "gold");
        Laptop id003 = new Laptop("Lenovo", "IdeaPad 3 15ALC6", "15.6", 4, 1000, "Ryzen 3 5300U", "gray");
        Laptop id004 = new Laptop("Huawei", "MateBook D16 RLEF-X", "16", 16, 512, "Intel Core i7 12700H", "gray");
        Laptop id005 = new Laptop("MSI", "GF76 Katana", "17.3", 8, 256, "Intel Core i5 11400H", "black");
        Laptop id006 = new Laptop("Xiaomi", "RedmiBook 15", "15.6", 8, 256, "Intel Core i3 1115G4", "gray");
        ArrayList<Laptop> catalogList = new ArrayList<>();
        Collections.addAll(catalogList, id001, id002, id003, id004, id005, id006);

        System.out.println("Доступные ноутбуки в нашем магазине:");
        for (int i = 0; i < catalogList.size(); i++) {
            catalogList.get(i).showInfo();
        }

        System.out.println("Применить фильтр? (y/n)");
        String decision = input1.next();
        if (decision.equals("y")) {
            boolean flag = true;
            while (flag) {
                System.out.print("Выберите фильтр, который хотите применить:" + '\n' +
                        "Фирма" + '\n' +
                        "Мазвание модели" + '\n' +
                        "Размер" + '\n' +
                        "Объем оперативной памяти" + '\n' +
                        "Объем памяти" + '\n' +
                        "Процессор" + '\n' +
                        "Цвет" + '\n');
                String user = input1.next();
                switch (user) {
                    case "Фирма":
                        System.out.print("Введите фирму: ");
                        String userBrand = input1.next();
                        ArrayList<Laptop> newBrandList = new ArrayList<>();
                        for (int i = 0; i < catalogList.size(); i++) {
                            if (catalogList.get(i).getBrand().equals(userBrand)) {
                                newBrandList.add(catalogList.get(i));
                            }
                        }
                        if (newBrandList.size() > 0) {
                            System.out.print("Имеющиеся ноутбуки по Вашему запросу: ");
                            for (int i = 0; i < newBrandList.size(); i++) {
                                newBrandList.get(i).showInfo();
                            }
                        }
                        break;

                    case "Мазвание модели":
                        System.out.print("Введите модель: ");
                        String userModel = input1.next();
                        ArrayList<Laptop> newModelList = new ArrayList<>();
                        for (int i = 0; i < catalogList.size(); i++) {
                            if (catalogList.get(i).getModel().equals(userModel)) {
                                newModelList.add(catalogList.get(i));
                            }
                        }
                        if (newModelList.size() > 0) {
                            System.out.print("Имеющиеся ноутбуки по Вашему запросу: ");
                            for (int i = 0; i < newModelList.size(); i++) {
                                newModelList.get(i).showInfo();
                            }
                        }
                        break;
                    case "Размер":
                        System.out.print("Введите размер: ");
                        String userSize = input1.next();
                        ArrayList<Laptop> newSizeList = new ArrayList<>();
                        for (int i = 0; i < catalogList.size(); i++) {
                            if (catalogList.get(i).getSize().equals(userSize)) {
                                newSizeList.add(catalogList.get(i));
                            }
                        }
                        if (newSizeList.size() > 0) {
                            System.out.print("Имеющиеся ноутбуки по Вашему запросу: ");
                            for (int i = 0; i < newSizeList.size(); i++) {
                                newSizeList.get(i).showInfo();
                            }
                        }
                        break;
                    case "Объем оперативной памяти":
                        System.out.print("Введите ОЗУ: ");
                        String userRam = input1.next();
                        ArrayList<Laptop> newRamList = new ArrayList<>();
                        for (int i = 0; i < catalogList.size(); i++) {
                            if (catalogList.get(i).getRandomAccessMemory() == Integer.parseInt(userRam)) {
                                newRamList.add(catalogList.get(i));
                            }
                        }
                        if (newRamList.size() > 0) {
                            System.out.print("Имеющиеся ноутбуки по Вашему запросу: ");
                            for (int i = 0; i < newRamList.size(); i++) {
                                newRamList.get(i).showInfo();
                            }
                        }
                        break;
                    case "Объем памяти":
                        System.out.print("Введите ПЗУ: ");
                        String userRom = input1.next();
                        ArrayList<Laptop> newRomList = new ArrayList<>();
                        for (int i = 0; i < catalogList.size(); i++) {
                            if (catalogList.get(i).getReadOnlyMemory()== Integer.parseInt(userRom)) {
                                newRomList.add(catalogList.get(i));
                            }
                        }
                        if (newRomList.size() > 0) {
                            System.out.print("Имеющиеся ноутбуки по Вашему запросу: ");
                            for (int i = 0; i < newRomList.size(); i++) {
                                newRomList.get(i).showInfo();
                            }
                        }
                        break;
                    case "Процессор":
                        System.out.print("Введите ЦПУ: ");
                        String userCpu = input1.next();
                        ArrayList<Laptop> newCpuList = new ArrayList<>();
                        for (int i = 0; i < catalogList.size(); i++) {
                            if (catalogList.get(i).getCentralProcessingUnit().equals(userCpu)) {
                                newCpuList.add(catalogList.get(i));
                            }
                        }
                        if (newCpuList.size() > 0) {
                            System.out.print("Имеющиеся ноутбуки по Вашему запросу: ");
                            for (int i = 0; i < newCpuList.size(); i++) {
                                newCpuList.get(i).showInfo();
                            }
                        }
                        break;
                    case "Цвет":
                        System.out.print("Введите цвет(black, gray, gold): ");
                        String userColour = input1.next();
                        ArrayList<Laptop> newColourList = new ArrayList<>();
                        for (int i = 0; i < catalogList.size(); i++) {
                            if (catalogList.get(i).getColour().equals(userColour)) {
                                newColourList.add(catalogList.get(i));
                            }
                        }
                        if (newColourList.size() > 0) {
                            System.out.print("Имеющиеся ноутбуки по Вашему запросу: ");
                            for (int i = 0; i < newColourList.size(); i++) {
                                newColourList.get(i).showInfo();
                            }
                        }
                        break;
                }
                flag = false;
            }
        }
    }
}

