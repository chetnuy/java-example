package core.massive;

import java.util.Arrays;

/**
 * @date: 12.12.17
 * @author: nevernew
 * @root: алгоритм быстрой сортировки
 */
public class QuickSort {
    static void meth(int[] arr, int left, int right){


        int h_left=left;
        int h_right=right;
        int pivot = arr[left];

        while (left<right) {
            while ((arr[right] >= pivot) && left < right) {
                right--;
            }
            if (right != left) {
                arr[left] = arr[right];
            }
            while ((arr[left] <= pivot) && left < right) {
                left++;
            }
            if (left != right) {
                arr[right] = arr[left];
            }
        }

            arr[left]=pivot;
            pivot = left;
            left = h_left;
            right = h_right;
            if (left<pivot)
                meth(arr,left,pivot-1);
            if (right>pivot)
                meth(arr,pivot+1,right);


    }

    static void quicksort(int arr[], int left, int right){
       int left_h = left;
       int right_h = right;
        int pivot = arr[left];

        while (left<right){
            while (arr[right]>=pivot && (left<right))
                right--;
            if(left!=right){
                arr[left]=arr[right];
            }
            while (arr[left]<=pivot && (left<right)){
                left++;
            }
            if(left!=right)
                arr[right]=arr[left];
            }

            arr[left]=pivot;
            pivot=left;
            left=left_h;
            right=right_h;

            if(left<pivot)
                quicksort(arr, left, pivot-1);
            if (right>pivot)
                quicksort(arr, pivot+1,right);

    }

    public static void main(String[] args)
    {
        //объявляем и заполняем массив случайными числами
        int arr[] = new int[9];
        for (int i=0; i<arr.length; i++){
            arr[i]=1+(int)(Math.random()*10);
        }
        //выводим массив перед сортировкой
        System.out.println(Arrays.toString(arr));

        //meth(arr, 0, arr.length-1);
        quicksort(arr,0,arr.length-1);

        //выводим после
        System.out.println(Arrays.toString(arr));



    }
}
