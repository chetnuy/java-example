package l2;

/**
 * @date: 31.12.17
 * author: nevernew
 *
 * Вывод символа по смещению относительно \
 *
 */


public class WordLastSlash {
    public static char Expression(int var){
        return (char) ('\\'+ var);
    }
    public static int CodeExp(char simbol){
        return (int)simbol;
    }

    public static void main(String[] args) {

        System.out.println(Expression(29));
//   System.out.println(CodeExp("\"));
    }
}
