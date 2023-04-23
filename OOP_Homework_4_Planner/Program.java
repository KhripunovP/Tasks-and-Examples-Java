package OOP_Homework_4_Planner;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<String> fullTasksListXls = new ArrayList<>();
        fullTasksListXls = ParserXls.parse("C:\\JavaTest\\Copy_BaseAboutPlans2.xls");
        System.out.println(fullTasksListXls);

        /** Заполнение свойств Объектов информацией из файла */
        ArrayList<TasksForHome> fullTasksList = new ArrayList<>();
        TasksForHome forAdd2 = new TasksForHome("", "", "", "");
        forAdd2.makeList(fullTasksList, fullTasksListXls);
        for (int i = 0; i < fullTasksList.size(); i++) {
            fullTasksList.get(i).showInfo();
        }

        /** Применение фильтра по приоритету */
        System.out.println("Выведем важные задачи");
        ArrayList<TasksForHome> listHigh = new ArrayList<>();
        forAdd2.choseMainTask(fullTasksList, listHigh);
        for (int i = 0; i < listHigh.size(); i++) {
            listHigh.get(i).showInfo();
        }
    }
}

