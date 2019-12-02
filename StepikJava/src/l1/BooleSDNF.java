package l1;

/**
 * @date: 30.12.17
 * @author: nevernew
 * Реализация таблицы сднф истина только в случае если два любых элемента истинны
 */


public class BooleSDNF {

    static boolean sdnf(boolean a, boolean b, boolean c, boolean d){

        return (a&b&!c&!d) | (a&!b&c&!d) | (a&!b&!c&d) | (!a&b&c&!d) |
                (!a&b&!c&d) | (!a&!b&c&d);
    }

    public static void main(String[] args) {
        BooleSDNF boole = new BooleSDNF();
        boolean sdnf = BooleSDNF.sdnf(true, false, true, false);

        System.out.printf(String.valueOf(sdnf));
    }
}

