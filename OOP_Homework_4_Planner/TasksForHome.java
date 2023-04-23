package OOP_Homework_4_Planner;

import java.util.ArrayList;

/** Наследуемый класс задач для дома */
public class TasksForHome extends Tasks {

    public TasksForHome(String Name_task, String Day, String How_much_time, String Priority) {
        super(Name_task, Day, How_much_time, Priority);
    }

    /** Метод для разделки считанной информации из файла по Объектами запись их в отдельный массив */
    public ArrayList<Tasks> makeList(ArrayList fullTask, ArrayList fullTaskXls) {
        for (int i = 0; i < fullTaskXls.size(); i = i + 4) {
            TasksForHome forAdd = new TasksForHome("", "", "", "");
            forAdd.setName_task((String) fullTaskXls.get(i));
            forAdd.setDay((String) fullTaskXls.get(i + 1));
            forAdd.setHow_much_time((String) fullTaskXls.get(i + 2));
            forAdd.setPriority((String) fullTaskXls.get(i + 3));
            fullTask.add(forAdd);
        }
        return fullTask;
    }

    /** Фильтр по критерию Приоритета задачи */

    public ArrayList<TasksForHome> choseMainTask(ArrayList list, ArrayList listHigh) {
        for (int i = 0; i < list.size(); i++) {
            TasksForHome obj = new TasksForHome("", "", "", "");
            obj = (TasksForHome) list.get(i);
            if (obj.getPriority().equals("High")) {
                listHigh.add(list.get(i));
            }
        }
        return listHigh;
    }
}
