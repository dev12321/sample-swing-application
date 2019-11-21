package com.example.dev;
import java.awt. *;
import javax.swing.*;
import java.awt.geom.Ellipse2D;
import java.util.Random;
import java.awt.Rectangle;
public class Rainy extends JComponent {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;



        g2.setPaint(Color.CYAN);
        g2.fill(new Ellipse2D.Double(10, 10, 150, 40));
        
        int[] x = {25,55,75,130,110,95};
        g2.setColor(Color.BLUE);
        int a = 100;
        while(a-->0) {
        	Random rand = new Random(); 
        	 g2.fill(new Ellipse2D.Double(x[rand.nextInt(6)], rand.nextInt(180-65)+65, 5,5));
        }


        
        
        g2.setColor(Color.BLUE);
        g2.fillRect(0, 220, 500, 50);




    }

		

}
