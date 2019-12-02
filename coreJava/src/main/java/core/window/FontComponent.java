package core.window;
import javax.swing.*;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.*;

public class FontComponent extends JComponent {


    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        String message = "Hello, World!";
        Font f = new Font("Serif", Font.BOLD, 36);
        g2.setFont(f);
// определить размеры текстового сообщения
        FontRenderContext context = g2.getFontRenderContext();
        Rectangle2D bounds = f.getStringBounds(message, context);
// определить координаты (x , у) верхнего левого угла текста
        double x = (getWidth() - bounds.getWidth()) / 2;
        double y = (getHeight() - bounds.getHeight()) / 2;
// сложить подъем с коо   чтобы достичь базовой линии
        double ascent = -bounds.getY();
        double baseY = y + ascent;
// воспроизвести текстовое сообщение
        g2.drawString(message,(int)x,(int) baseY);
        g2.setPaint(Color.LIGHT_GRAY);
// нарисовать базовую линию
        g2.draw(new Line2D.Double(x, baseY,x + bounds.getWidth(), baseY));
// нарисовать ограничивающий прямоугольник
        Rectangle2D rect = new Rectangle2D.Double(x, y,bounds.getWidth(), bounds.getHeight());
        g2.draw(rect);
    }
    public Dimension getPreferredSize()
    { return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT); }}