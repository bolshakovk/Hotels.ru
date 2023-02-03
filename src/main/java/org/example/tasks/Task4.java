package org.example.tasks;


//около 25-35 минут
public class Task4 {

    public String getLaptops(int i){
        String result;
        if (i % 100 > 4 && i % 100 < 21) {
            result = i + " компьютеров";
        } else if (i % 10 == 1) {
            result = i + " компьютер";
        } else if (i % 10 > 1 && i % 10 < 5) {
            result = i + " компьютерa";
        }
        else {
            result = i + " компьютеров";
        }
        return result;
    }
}
