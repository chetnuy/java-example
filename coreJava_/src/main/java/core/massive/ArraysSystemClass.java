package core.massive;

import java.util.Arrays;

/**
 * @date: 01.12.17
 * @author: nevernew
 * @root: сортировка и поиск элементов штатными средствами
 */
public class ArraysSystemClass {
    public static void main(String[] args) {

        int arr [] = {2, 3, 1, 7, 4, 2, 4, 7, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    // выводит индекс первого найденного элемента
        System.out.println(Arrays.binarySearch(arr,  2));
    }
}
