package org.example.tasks;
// 3-5 минут
public class Task3 {

    public boolean isSimple(int i){
        if (i < 2){
            return false;
        }
        double s = Math.sqrt(i);
        for (int j = 2; j <= s; j++){
            if (i % j == 0){
                return false;
            }
        }
        return true;
    }
}
