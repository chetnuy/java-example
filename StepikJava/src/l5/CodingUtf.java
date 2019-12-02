package l5;

import java.io.CharArrayReader;
import java.io.Reader;
import java.io.StringReader;

/**
 * @date: 10.01.18
 * author: nevernew
 */


public class CodingUtf {


        public static void main(String[] args) {
                String s = "Ы";
                byte [] b = s.getBytes();
                for (int i = 0; i < b.length; i++) {
                        System.out.print(((int)b[i] ^ -1<<8)+" ");
                }
        }
}
