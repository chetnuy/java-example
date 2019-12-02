
package core.window;

import javax.swing.*;
import java.awt.geom.*;
import java.awt.*;


class DrawComponent extends JComponent
{
    private static final int DEFAULT_WIDTH = 400;
    private static final int DEFAULT_HEIGHT = 400;
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
// нарисовать прямоугольник
        double  leftX = 100;
        double topY = 100;
        double width = 200;
        double height = 150;
        Rectangle2D rect =  new Rectangle2D.Double(leftX, topY, width, height);
        g2.draw(rect);
        g2.setColor(Color.RED);
// нарисовать вписанный эллипс
        Ellipse2D ellipse = new Ellipse2D.Double();
        ellipse.setFrame(rect);
        g2.draw(ellipse);
        g2.fill(rect);
// нарисовать диагональную линию
        g2.draw(new Line2D.Double(leftX, topY, leftX + width,
                topY + height));
// нарисовать окружность с тем же самым центром
        double centerX = rect.getCenterX();
        double centerY = rect.getCenterY();
        double radius = 150;
        Ellipse2D circle = new Ellipse2D.Double();
        circle.setFrameFromCenter(centerX, centerY,
                centerX + radius, centerY + radius);
        g2.draw(circle);
    }
    public Dimension getPreferredSize()
    { return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT); }
}