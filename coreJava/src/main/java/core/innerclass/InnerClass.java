package core.innerclass;

import javax.swing.*;
import java.awt.*;

/**
 * @date: 05.12.17
 * @author: nevernew
 * @root:
 * Программа выводит каждую секунду текущее время в консоль
 *
 */
public class InnerClass {
    public static void main(String[] args) {
        TalkingClass talkingClass = new TalkingClass(1000, true);
        talkingClass.start();
        JOptionPane.showMessageDialog(null, "quit programm");
        System.exit(0);
    }
}
