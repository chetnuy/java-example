package core.massive;

import java.util.Arrays;

/**
 * @date: 01.12.17
 * @author: nevernew
 * @root: работа с аргументами, без парамеров эксепшен выдает
 */
public class MainArgs {
    public static void main(String[] args) {
    // Работа с аргументами строки запуска, без аргументов выдает exeption
     /*   switch (args[0]){
            case "-s":
                System.out.println("result "+args[1]+args[2]);
                break;
            case  "-n":
                System.out.println("Hello, "+ args[1]);
                break;*/

    if(args[0].equals("-h"))
        System.out.println("hello!");
    else if (args[0].equals("-g"))
        System.out.println("goodbye!");

        System.out.println("args: "+ Arrays.toString(args));
    }
}
