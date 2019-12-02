package core.reflection;
import java.io.OutputStream;

/**
 * date: 02.12.17
 * author: nevernew
 */


public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class name = Class.forName("java.io.OutputStream");
        String s = name.getName();
        System.out.println(s);
    }
}
