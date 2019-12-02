package core.input;

//      date:             30.11.17
//      author:         nevernew
//      Простой ввод переменной через консоль
//      Скрытый ввод пароля в массив чаров

import java.io.Console;
import java.util.Scanner;

public class InputTerminal {

    public static void main(String[] args) {

        Scanner  scanner = new Scanner(System.in);
        System.out.println("What you're name?");

        // Ввод через линию
        // String name = scanner.nextLine();

        // Ввод одного слова
        String name = scanner.next();
        System.out.println("Hello, "+name);

        //ввод пароля
        //Ввод пароля возможен только на системную консоль!!
        System.out.println("insert password and name");
        Console cons = System.console();
        String username;
        username = cons.readLine("User name: ");
        char[] passwd = cons.readPassword("Password:");

        // конвертируем массив чаров в строку перед выводом
        System.out.println(username);
        String pass = new String(passwd);
        System.out.println(pass);


    }


}
