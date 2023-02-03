package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Москва", "Санкт-Петербург", "Воронеж"));
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(7, 17, 1, 9, 1, 17, 56, 56, 23));
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(56, 17, 17, 1, 23, 34, 23, 1, 8, 1));
        Facade facade = new Facade();
        facade.setCities(cities);
        facade.setListsOfArrays(arrayList1, arrayList2);
        facade.setN(5);
        facade.printAnswers();
    }
}