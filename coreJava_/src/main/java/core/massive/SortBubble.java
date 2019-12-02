package core.massive;

//      date:             30.11.17
//      author:         nevernew
//      cортировка простого массива пузырьком
//      массив заполнен случайными числами от 1-10

import java.util.Arrays;

public class SortBubble {

    public static void main(String[] args) {

        // инициализируем переменные
        int max;
        int[] massive = new int[10];

        // заполняем массив случайными числами

        for (int i = 0; i < 10; i++) {
            massive[i] = 1+(int)(Math.random()*10);
        }
        System.out.println("create massive: ");
        System.out.println(Arrays.toString(massive));

        //сортируем массив

        for (int y=0; y<9; y++) {

            for (int i = 0; i < 9; i++) {

                if (massive[i] > massive[i + 1])
                {
                    max = massive[i];
                    massive[i] = massive[i + 1];
                    massive[i + 1] = max;

                }
            }
        }
        System.out.println("sort massive:");
        System.out.println(Arrays.toString(massive));

    }
}
