package l4;

import java.io.IOException;

/**
 * @date: 09.01.18
 * author: nevernew
 */


public class ClassException extends IOException {

    public static double sqrt(double x) {

        if (x<0) throw new IllegalArgumentException("Expected non-negative number, got "+x);

        return x = Math.sqrt(x);

    }

    public static void main(String[] args) {
        System.out.println(sqrt(-10));


    }

}
