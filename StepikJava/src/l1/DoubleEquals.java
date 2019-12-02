package l1;

/**
 * @date: 30.12.17
 * @author: nevernew
 * если хочешь сравнить два больших числа
 * находим модули и смотрим насколько больше остаток от погрешности
 */


public class DoubleEquals {
    public static boolean expressions (double a, double b, double c){
        return Math.abs(a+b-c)<1E-4;
    }

    public static void main(String[] args) {

       DoubleEquals doubleEquals = new DoubleEquals();
        System.out.println(doubleEquals.expressions(0.1,0.2,0.3));

    }
}
