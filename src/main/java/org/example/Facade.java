package org.example;

import org.example.tasks.*;

import java.util.ArrayList;

public class Facade {
    private final Task1 task1;
    private final Task2 task2;
    private final Task3 task3;
    private final Task4 task4;
    private final Task5 task5;
    private final Task6 task6;
    private ArrayList<String> c;
    private int number;
    private ArrayList<Integer> list1;
    private ArrayList<Integer> list2;
    public Facade() {
        task1 = new Task1();
        task2 = new Task2();
        task3 = new Task3();
        task4 = new Task4();
        task5 = new Task5();
        task6 = new Task6();
    }
    public void printAnswers(){
        System.out.println(task1.setCitySeparated(c));
        System.out.println(task2.setFloatToIntDividedByFive(41.7F));
        System.out.println(task4.getLaptops(1048));
        System.out.println(task3.isSimple(7));
        System.out.println(task5.union(list1, list2));
        task6.table(number);
    }

    public void setCities(ArrayList<String> cities) {
        this.c = cities;
    }

    public void setListsOfArrays(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2) {
        this.list1 = arrayList1;
        this.list2 = arrayList2;
    }

    public void setN(int i) {
        this.number = i;
    }
}
