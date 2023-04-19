package OOP_Homework_4_Planner;


/** Описание и основные методы класса задач */
public abstract class Tasks implements ActionsWithTasks {
    private String Name_task;
    private String Day;
    private String How_much_time;
    private String Priority;

    public String toString(){
        return  "Задача - " + Name_task + '\n' +
                "День - " + Day + '\n' +
                "Сколько потребуется времени (ч) - " + How_much_time + '\n' +
                "Приоритет задачи - " + Priority + '\n';
    }
    public void showInfo(){
        System.out.println(this);
    }

    public Tasks (String Name_task, String Day, String How_much_time, String Priority) {
        this.Name_task = Name_task;
        this.Day = Day;
        this.How_much_time = How_much_time;
        this.Priority = Priority;
    }

    public String getName_task() {
        return Name_task;
    }

    public void setName_task(String name_task) {
        Name_task = name_task;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String day) {
        Day = day;
    }

    public String getHow_much_time() {
        return How_much_time;
    }

    public void setHow_much_time(String how_much_time) {
        How_much_time = how_much_time;
    }

    public String getPriority() {
        return Priority;
    }

    public void setPriority(String priority) {
        Priority = priority;
    }

}

