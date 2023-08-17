
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Toys implements addNewToys {
    Scanner input1 = new Scanner(System.in);
    private int id;
    private String name;
    private int number;
    private int freq;

    @Override
    public String toString() {
        return "id - " + id + '\n' +
                "Название - " + name + '\n' +
                "Количество - " + number + '\n' +
                "Шансы - " + freq + '\n';
    }

    public Toys(int id, String name, int number, int freq) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.freq = freq;
    }

    public void showInfo() {
        System.out.println(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getFreq() {
        return freq;
    }

    public void setFreq(int freq) {
        this.freq = freq;
    }

    /**
     * Метод добавления новых игрушек
     **/

    public Toys addNewToys(ArrayList<Toys> startToys) {
        System.out.println("Введите название игрушки:");
        String nameNewToy = input1.next();
        System.out.println("Введите количество игрущек");
        int numberNewToy = input1.nextInt();
        System.out.println("Введите как часто игрушка может выпадать как приз при розыгрыше призов:");
        int freqNewToy = input1.nextInt();
        Toys newToy = new Toys(0, "", 0, 0);
        newToy.setId(startToys.size() + 1);
        newToy.setName(nameNewToy);
        newToy.setNumber(numberNewToy);
        newToy.setFreq(freqNewToy);
        return newToy;
    }

    /**
     * Метод поиска по id
     **/
    public Toys searchToysId(ArrayList<Toys> startToys) {
        System.out.print("Введите id: ");
        Toys searchToy = new Toys(0, "", 0, 0);
        int userId = input1.nextInt();
        for (int i = 0; i < startToys.size(); i++) {
            if (startToys.get(i).getId() == userId) {
                System.out.print("Запрашиваемая игрушка:");
                startToys.get(i).showInfo();
                searchToy = startToys.get(i);
            }
            break;
        }
        return searchToy;
    }

    /**
     * Метод поиска по названию
     **/
    public Toys searchToysName(ArrayList<Toys> startToys) {
        System.out.print("Введите название: ");
        Toys searchToy = new Toys(0, "", 0, 0);
        int userName = input1.nextInt();
        for (int i = 0; i < startToys.size(); i++) {
            if (startToys.get(i).getName().equals(userName)) {
                System.out.print("Запрашиваемая игрушка:");
                startToys.get(i).showInfo();
                searchToy = startToys.get(i);
            }
            break;
        }
        return searchToy;
    }

    /**
     * Метод замены шанса выйгрыша игрушки
     **/
    public void changeFreq() {
        System.out.println("Введите новый шанс выйгрыша игрушки (0-100):");
        int userFreq = input1.nextInt();
        this.setFreq(userFreq);
    }

    /**
     * Метод розыгрыша призов
     **/
    public Toys game(ArrayList<Toys> startToys) {
        int prod = 0;
        double sum = 0;
        double div = 0;
        int rand = (int) (Math.random() * 100);
        double forSearch = 0;
        ArrayList<Integer> listProd = new ArrayList<>();
        ArrayList<Double> listDiv = new ArrayList<>();
        Toys testObj = new Toys(0, "", 0, 0);
        System.out.println("Розыгрыш начался");
        for (int i = 0; i < startToys.size(); i++) {
            prod = startToys.get(i).getNumber() * startToys.get(i).getFreq();
            sum = sum + prod;
            listProd.add(prod);
        }
        for (int j = 0; j < listProd.size(); j++) {
            div = Math.floor(listProd.get(j) / sum * 100);
            listDiv.add(div);
        }
        for (int i = 0; i < listDiv.size(); i++) {
            if ((forSearch < rand) && (rand < (forSearch + listDiv.get(i)))) {
                System.out.println("Поздравляем! Вы выйграли: " + startToys.get(i).getName());
                int newNumber = startToys.get(i).getNumber() - 1;
                startToys.get(i).setNumber(newNumber);
                testObj = startToys.get(i);
                forSearch = forSearch + listDiv.get(i);
            } else {
                forSearch = forSearch + listDiv.get(i);
            }
        }
        return testObj;
    }

    public void writingFile(Toys toy) {
        try (FileWriter writer = new FileWriter("src/WonToys.txt.txt", true)) {
            String text = toy.getName();
            writer.write(text);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println("Что-то не так с записью в файл");
        }
    }

    public void readingFile() {
        File file = new File("src/WonToys.txt.txt");
        try (FileReader reader = new FileReader(file)) {
            char[] chars = new char[(int) file.length()];
            reader.read(chars);
            String fileContent = new String(chars);
            System.out.println(fileContent);
        } catch (IOException ex) {
            System.out.println("Что-то не так с чтением файла");
        }
    }
}


