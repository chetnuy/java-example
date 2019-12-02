package l2;

/**
 * @date: 31.12.17
 * author: nevernew
 */


public class PowerTwo {
    static boolean power(int x){
        x = Math.abs(x);
        return ((x != 0) && ((x & (~x + 1)) == x));
    }

    public static void main(String[] args) {
        System.out.println(power(-2));
    }
}
