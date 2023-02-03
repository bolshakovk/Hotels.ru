package org.example.tasks;

import java.util.ArrayList;
import java.util.Iterator;

//10-14 минут
public class Task1 {
    public String setCitySeparated(ArrayList<String> arrayList){
        StringBuilder result = new StringBuilder();
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            result.append(item);
            if (!iterator.hasNext()) {
                result.append(".");
                break;
            }
            result.append(", ");
        }
        return String.valueOf(result);
    }
}
