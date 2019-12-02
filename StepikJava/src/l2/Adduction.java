package l2;

/**
 * @date: 31.12.17
 * author: nevernew
 * тестируем какие типы могут быть приведены автоматом по идее все
 * типы которые меньше должны автоматом расширяться
 *  byte -> char
long -> float
int -> long
float -> long
int -> boolean
char -> Character
char -> int
String -> int
 Нельзя привести флоат к лонгу
 */


public class Adduction {
    public static void main(String[] args) {

        char c = 'd';
        byte b = 11;
        int i = 30;
        boolean bo = true;
        float f = 100;
        long l = 10;
        Character cha = 'c';
        String str = "sadf";

        c = (char) b; // byte -> char
        f = l;
        l = i;
        l = (long) f;
        i = (int)f;
       // b = i;
        cha = c;
        //i= (int)str;

    }

}
