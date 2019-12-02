package core.window;

import javax.swing.*;
import java.awt.*;

public class FontTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->
        {
            JFrame frame = new FontFrame();
            frame.setTitle("FontSimply");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
    });
}
}
