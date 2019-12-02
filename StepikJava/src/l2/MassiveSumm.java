package l2;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @date: 31.12.17
 * author: nevernew
 * сортиртивка двух упорядоченных массивов
 *
 */
public class MassiveSumm {

    public static int[] mergeArrays(int[] a1, int[] a2) {

        int [] arrSum = new int[a1.length +a2.length];
        int i1 = 0;
        int i2 = 0;
        int i=0;

        while (i < arrSum.length){
            arrSum[i] = (a1[i1]<a2[i2] ?  a1[i1++] : a2[i2++]);
            if (i1 == a1.length) {
                System.arraycopy(a2, i2, arrSum, ++i, a2.length-i2);
                break;
            }
            if (i2==a2.length){
                System.arraycopy(a1, i1, arrSum, ++i, a1.length-i1);
                break;
            }
            i++;
        }
        return arrSum;

    }

    static int [] createMassive(int x){
        int arr [] = new int[x];
        for (int i =0; i<arr.length; i++) {
            arr[i] = 1 + (int) (Math.random() * 10);
        }
        System.out.println("arr: " + Arrays.toString(arr));
        return arr;
    }

    static void sortArray(int[] arr1){
        int arr[] = arr1;
        Arrays.sort(arr);
        System.out.println("sort arr :"+ Arrays.toString(arr));

    }


    public static void main(String[] args) {
        int arr1 []= createMassive(8);
        sortArray(arr1);
        int arr2 []= createMassive(10);
        sortArray(arr2);
        int merge [] =mergeArrays(arr1, arr2);
        System.out.println(Arrays.toString(merge));
    }



}