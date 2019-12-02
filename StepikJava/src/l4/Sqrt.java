package l4;

/**
 * @date: 05.01.18
 * author: nevernew
 */


public class Sqrt {

    public static double sqrt(double x) {

        try {
            x = Math.sqrt(x);
        }
        catch (java.lang.IllegalArgumentException e) {
            System.out.println("sdfasdfas");
        }



        return x; // your implementation here

    }

    public static void main(String[] args) {
        System.out.println(Math.sqrt(-4.0));
        System.out.println(sqrt(-1.40));

    }

}

