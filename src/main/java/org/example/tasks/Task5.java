package org.example.tasks;

import java.util.*;

// 35-40 минут
public class Task5 {

    public <T> List getDuplicate(Collection<T> list) {

        final List<T> duplicatedObjects = new ArrayList<>();
        Set<T> set = new HashSet<>() {
            @Override
            public boolean add(T e) {
                if (contains(e)) {
                    duplicatedObjects.add(e);
                }
                return super.add(e);
            }
        };
        set.addAll(list);
        return duplicatedObjects;
    }

    public HashSet<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
        HashSet<Integer> result = new HashSet<>();
        ArrayList duplicateList1 = new ArrayList<>(getDuplicate(list1));
        ArrayList duplicateList2 = new ArrayList<>(getDuplicate(list2));
        for (Object integer : duplicateList1) {
            for (Object value : duplicateList2) {
                if (Objects.equals(integer, value)) {
                    result.add((Integer) integer);
                }
            }
        }
        return result;
    }
}
