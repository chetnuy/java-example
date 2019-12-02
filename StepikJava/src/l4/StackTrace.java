package l4;

import java.util.Arrays;

/**
 * @date: 09.01.18
 * author: nevernew
 */


public class StackTrace {


    public static String getCallerClassAndMethodName(){
        StackTraceElement [] str = new Exception().getStackTrace();

        if (str.length<=2){
            return null;}
        else {
            return str[2].getClassName() + "#" + str[2].getMethodName();
        }
    }

    public static void Hex(){
        System.out.println(getCallerClassAndMethodName());
    }

    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        Hex();

    }
}
