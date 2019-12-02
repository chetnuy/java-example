package l2;

import java.math.BigInteger;

/**
 * @date: 31.12.17
 * author: nevernew
 *  факториал с мультиплексором
 *  интерес представляет BigInteger и работа с ним
 */


public class Factorial {

    static BigInteger fack(int value){
        BigInteger y = BigInteger.valueOf(1);
        for (int i=1; i<=value; i++){
            y = y.multiply(BigInteger.valueOf(i));
        }
        return y;

    }

    public static void main(String[] args) {
        System.out.println(fack(3));
    }
}
