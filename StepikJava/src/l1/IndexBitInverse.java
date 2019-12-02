package l1;

/**
 * @date: 31.12.17
 * author: nevernew
 * инвертирование указонного индексом бита
 */


public class IndexBitInverse {

    public static int flipBit(int value, int bitIndex) {
        return value ^ (1 << (bitIndex - 1));
    }
    public static void main(String[] args) {
        System.out.println(flipBit(6, 2));
    }
}
// 1 << (bitIndex - 1) // сдвигаем 1 на 0-31 количество позиций:
// 1 —> 10, если bitIndex = 2