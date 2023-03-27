package lesson6;

public class Laptop {
    private String brand;
    private String model;
    private String size;
    private Integer randomAccessMemory;
    private Integer readOnlyMemory;
    private String centralProcessingUnit;
    private String colour;

    public String toString(){
        return "Ноутбук:" +
                "Фирма - " + brand + '\'' +
                "Мазвание модели - " + model + '\'' +
                "Размер - " + size + '\'' +
                "Объем оперативной памяти - " + randomAccessMemory + '\'' +
                "Объем памяти - " + readOnlyMemory + '\'' +
                "Процессор - " + centralProcessingUnit + '\'' +
                "Цвет - " + colour + '\n';

    }
    public void showInfo(){
        System.out.println(this);
    }

    public Laptop(String brand, String model, String size, Integer randomAccessMemory, Integer readOnlyMemory, String centralProcessingUnit, String colour) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.randomAccessMemory = randomAccessMemory;
        this.readOnlyMemory = readOnlyMemory;
        this.centralProcessingUnit = centralProcessingUnit;
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getRandomAccessMemory() {
        return randomAccessMemory;
    }

    public void setRandomAccessMemory(Integer randomAccessMemory) {
        this.randomAccessMemory = randomAccessMemory;
    }

    public Integer getReadOnlyMemory() {
        return readOnlyMemory;
    }

    public void setReadOnlyMemory(Integer readOnlyMemory) {
        this.readOnlyMemory = readOnlyMemory;
    }

    public String getCentralProcessingUnit() {
        return centralProcessingUnit;
    }

    public void setCentralProcessingUnit(String centralProcessingUnit) {
        this.centralProcessingUnit = centralProcessingUnit;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
