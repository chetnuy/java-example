package core.massive;

import java.util.Arrays;

/**
 * @date: 01.12.17
 * @author: nevernew
 * @root: копирование массива из одного в другой
 *              один меньше, а другой  больше
 */
public class CopyMassive {
    public static void main(String[] args) {
        int a[] = new int[10];
        int c[] = new int[4];
        int b[] = {1, 2, 3, 4, 5, 6};

        a = Arrays.copyOf(b, b.length);

        // копируем в меньший массив
        c = Arrays.copyOf(b, c.length);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(c));

    }
}
