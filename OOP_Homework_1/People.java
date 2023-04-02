package OOP_Homework_1;

import java.util.ArrayList;

public class People implements GetInfoForRelatives {
    private String Name;
    private String sex;
    private int age;
    private String job;
    private boolean isMarried;
    private String PartnerName;
    private int countPet;
    private ArrayList<String> PetName;
    private int countBrothers;
    private ArrayList<String> BrotherName;
    private int countSisters;
    private ArrayList<String> SisterName;
    private int countChildren;
    private ArrayList<String> ChildName;

    public People() {
    }

    @Override
    public String toString() {
        return "Имя - " + Name + '\n' +
                "Пол - " + sex + '\n' +
                "Возраст - " + age + '\n' +
                "Работа - '" + job + '\n' +
                "Женат или замужем? - " + isMarried + '\n' +
                "Как зовут жену/мужа? - " + PartnerName + '\n' +
                "Количество питомцев - " + countPet + '\n' +
                "Кличка(и) питомца(ев) - " + PetName + '\n' +
                "Количество братьев - " + countBrothers + '\n' +
                "Имена братьев" + BrotherName + '\n' +
                "Количество сестер" + countSisters + '\n' +
                "Имена сестер - " + SisterName + '\n' +
                "Количество детей - " + countChildren + '\n' +
                "Имена детей - " + ChildName + '\n';
    }

    public void showInfo(){
        System.out.println(this);
    }

    public People(String name, String sex, int age, String job, boolean isMarried, int countPet, int countBrothers, int countSisters, int countChildren) {
        Name = name;
        this.sex = sex;
        this.age = age;
        this.job = job;
        this.isMarried = isMarried;
        this.countPet = countPet;
        this.countBrothers = countBrothers;
        this.countSisters = countSisters;
        this.countChildren = countChildren;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public String getPartnerName() {
        return PartnerName;
    }

    public void setPartnerName(String partnerName) {
        PartnerName = partnerName;
    }

    public int getCountPet() {
        return countPet;
    }

    public void setCountPet(int countPet) {
        this.countPet = countPet;
    }

    public ArrayList<String> getPetName() {
        return PetName;
    }

    public void setPetName(ArrayList<String> petName) {
        PetName = petName;
    }

    public int getCountBrothers() {
        return countBrothers;
    }

    public void setCountBrothers(int countBrothers) {
        this.countBrothers = countBrothers;
    }

    public ArrayList<String> getBrotherName() {
        return BrotherName;
    }

    public void setBrotherName(ArrayList<String> brotherName) {
        BrotherName = brotherName;
    }

    public int getCountSisters() {
        return countSisters;
    }

    public void setCountSisters(int countSisters) {
        this.countSisters = countSisters;
    }

    public ArrayList<String> getSisterName() {
        return SisterName;
    }

    public void setSisterName(ArrayList<String> sisterName) {
        SisterName = sisterName;
    }

    public int getCountChildren() {
        return countChildren;
    }

    public void setCountChildren(int countChildren) {
        this.countChildren = countChildren;
    }

    public ArrayList<String> getChildName() {
        return ChildName;
    }

    public void setChildName(ArrayList<String> childName) {
        ChildName = childName;
    }
}
