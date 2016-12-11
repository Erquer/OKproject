package ProgramPackage;

import ProgramPackage.TaskPackage.Task;

import java.util.LinkedList;

/**
 * Created by Jarek on 2016-12-06.
 */
public class Solution {
    private int function_target = -1;
    //solution_array[0] - maszyna nr 1 , solution_array[1] - maszyna nr 2
    private LinkedList <Task> machine1;
    private LinkedList <Task> machine2;

    /**
     * Konstruktor klasy Solution
     * @param machine1 - lista zadań na maszynie nr 1, ustawione w kolejności
     * @param machine2 - lista zadań na maszynie nr 2, ustawione w kolejności
     */
    public Solution(LinkedList<Task> machine1, LinkedList<Task> machine2) {
        this.machine1 = machine1;
        this.machine2 = machine2;

    }

    public int getFunction_target() {
        return function_target;
    }

    public void displayMachine1(){
        System.out.println("Maszyna nr 1");
        for (Task x: machine1){
            System.out.println("nazwa operacji : " + x.getTask_name() + " " + x.getNumber_task()
                    + " ; czas pracy : " + x.getTime_start()
                    + " - " + (x.getTime_start()+x.getDuration()));
        }
    }

    public void displayMachine2(){
        System.out.println("Maszyna nr 2");
        for (Task x: machine2){
            System.out.println("nazwa operacji : " + x.getTask_name() + " " + x.getNumber_task()
                    + " ; czas pracy : " + x.getTime_start()
                    + " - " + (x.getTime_start()+x.getDuration()));
        }

    }

    /**
     * Funkcja obliczająca, wstępnie do zadania nr 3, czas wykonania ostatniego zadania.
     */
    public void setFunction_target() {

        int m1_end_time = machine1.getLast().getTime_start() + machine1.getLast().getDuration();
        int m2_end_time = machine2.getLast().getTime_start() + machine2.getLast().getDuration();

        if (m1_end_time > m2_end_time) {
            this.function_target = m1_end_time;
        }
        else {
            this.function_target = m2_end_time;
        }
    }
}
