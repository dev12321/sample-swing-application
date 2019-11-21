package com.example.dev;
import javax.swing. *;
import java.awt. *;
import java.awt.geom.Ellipse2D;

public class Summer extends Canvas {
    @Override public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        setBackground(Color.WHITE);
        g2.setColor(Color.blue);
        g2.fillRect(0, 0, 1500, 150);
        g2.setPaint(Color.YELLOW);
        g2.fill(new Ellipse2D.Double(100, 100, 150, 140));
        g2.setPaint(Color.BLUE);

    }



}
