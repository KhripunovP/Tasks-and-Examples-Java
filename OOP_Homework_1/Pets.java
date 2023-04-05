package OOP_Homework_1;

public abstract class Pets {
    private  String TypePet;
    private String Name;
    private String sex;
    private int age;
    private String breed;

    @Override
    public String toString() {
        return  "Котик или пёсель? - " + TypePet + '\n' +
                "Кличка - " + Name + '\n' +
                "Пол - " + sex + '\n' +
                "Возраст - " + age + '\n' +
                "Порода - " + breed + '\n' ;
    }

    public void showInfo(){
        System.out.println(this);
    }

    public Pets(String TypePet, String name, String sex, int age, String breed) {
        this.TypePet = TypePet;
        this.Name = name;
        this.sex = sex;
        this.age = age;
        this.breed = breed;
    }

    public String getTypePet() {
        return TypePet;
    }

    public void setTypePet(String typePet) {
        TypePet = typePet;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
