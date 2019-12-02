package core.innerclass;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.Timer;


/**
 * @date: 05.12.17
 * @author: nevernew
 * @root:
 */
public class TalkingClass {
    private int interval;
    private boolean beep;

    public TalkingClass(int interval, boolean beep){
        this.interval = interval;
        this.beep = beep;
    }
    public void start(){
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(interval, listener);
        t.start();

            }
    public class TimePrinter implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("At the tone, the time "+ new Date());
            if(beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}
