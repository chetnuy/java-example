package core.window;
/**
*Программа рисует фигуры во фрейме
*задействованы три класса DrawComponent, DrawFrame
 */

import java.awt.*;
import javax.swing.*;

public class DrawTest {

    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
        {
            JFrame frame = new DrawFrame();
            frame.setTitle("DrawTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

