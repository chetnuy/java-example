/** простой фрейм
 * 
 */


package core.window;

import javax.swing.*;
import java.awt.*;

public class SimplyFrame {

    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
                {
                    JFrame frame = new JFrame();
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                }
        );
    }
}
