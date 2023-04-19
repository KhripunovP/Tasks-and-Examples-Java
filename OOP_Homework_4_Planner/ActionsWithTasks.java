package OOP_Homework_4_Planner;

import java.util.ArrayList;

/** Интерфейс длязадач для дома */
public interface ActionsWithTasks<T, V>{
    ArrayList<T> makeList (ArrayList<T> fullTask, ArrayList<T> fullTaskXls);

    /** Интерфейс ниже не получилось реализовать в методе из-за "нестыковки" типов, поэтому в классе реализован этоот метод "отдельно" */
//    ArrayList<T> choseMainTask(ArrayList<T> list, ArrayList<T> listHigh, V obj);
}

