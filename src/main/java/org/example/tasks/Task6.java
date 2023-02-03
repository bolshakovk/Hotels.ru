package org.example.tasks;

// около часа
public class Task6 {
    public int[][] table(int n) {
        int[][] arr = new int[n][n];

        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <= n; j++) {
                // запись по низу
                if (i != 0 && j == 0){
                    System.out.print(i+"\t");
                }
                //запись по верху
                else if(j!=0 && i ==0) {
                    System.out.print(j+"\t");
                    // Запись таблицы
                }else{
                    System.out.print(j * i + "\t");
                }

            }
            System.out.println();
        }

        return arr;
    }
}
