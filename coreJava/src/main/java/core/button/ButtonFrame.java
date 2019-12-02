package core.button;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 8
 * Фрейм с панелью экранных кнопок
 9 */
public class ButtonFrame extends JFrame {
    private JPanel buttonPanel;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public ButtonFrame() {

        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        // создать экранные кнопки
        JButton yellowButton = new JButton("Yellow");
        JButton blueButton = new JButton("Blue");
        JButton redButton = new JButton("Red");

        buttonPanel = new JPanel();
// ввести экранные кнопки на панели
        buttonPanel.add(yellowButton);
        buttonPanel.add(blueButton);
        buttonPanel.add(redButton);
        // ввести панель во фрейм
        add(buttonPanel);
        // сформировать действия экранных кнопок
        ColorAction yellowAction = new ColorAction(Color.YELLOW);
        ColorAction blueAction = new ColorAction(Color.BLUE);
        ColorAction redAction = new ColorAction(Color.RED);
// связать действия с экранными кнопками
        yellowButton.addActionListener(yellowAction);
        blueButton.addActionListener(blueAction);
        redButton.addActionListener(redAction);
    }

    /**
     * Приемник действий, устанавливающий цвет фона панели
     */
    private class ColorAction implements ActionListener {
        private Color backgroundColor;

        public ColorAction(Color c)
        {
            backgroundColor = c;
        }


        public void actionPerformed(ActionEvent event) {
            buttonPanel.setBackground(backgroundColor);
        }

    }
}
