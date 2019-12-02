package core.massive;

import java.util.Arrays;

/**
 * @date: 13.12.17
 * @author: nevernew
 * Сортировка методом Шелла
 *
 */

/*void shellsort (int v[], int n)
        {
        int gap, i, j, temp;
        for (gap = n/2; gap > 0; gap /= 2)
        for (i = gap; i < n; i++)
        for (j = i - gap; j >= 0 && v[j] > v[j + gap]; j -= gap) {
        temp = v[j];
        v[j] = v[j + gap];
        v[j + gap] = temp;
        */


public class ShellSort {


    static void Shellmethod(int arr[], int len){

        int temp, i, gap, j;

        for(gap=len/2; gap>0;gap/=2) {

            for (i = gap; i < len; i++){

                for (j = i - gap; j >= 0 && arr[j] > arr[j + gap]; j -= gap) {
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }

        }

    }
    public static void main(String[] args) {
        int arr[] = new int[9];
        for (int i=0; i<arr.length; i++){
            arr[i]=1+(int)(Math.random()*10);
        }
        //выводим массив перед сортировкой
        System.out.println(Arrays.toString(arr));

        Shellmethod(arr,arr.length);
      //  quicksort(arr,0,arr.length-1);

        //выводим после
        System.out.println(Arrays.toString(arr));
    }
}
