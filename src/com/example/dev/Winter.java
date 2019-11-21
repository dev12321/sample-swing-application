package com.example.dev;
import java.awt. *;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.util.Random;

import javax.swing.*;

public class Winter extends Canvas {
	
	
	 @Override
     public void paint(Graphics g) {
        setBackground(Color.BLACK);  // set background color for this JPanel

        g.setColor(Color.WHITE);    // set the drawing color
        //g.drawLine(30, 40, 100, 200);
        g.fillOval(280, 120, 100, 100);
        g.drawOval(280, 120, 100, 100);
        g.fillOval(220, 200, 200, 200);
        g.drawOval(220, 200, 200, 200);
        g.setColor(Color.BLACK);
        g.drawOval(280, 120, 100, 100); 
        g.drawOval(220, 200, 200, 200);
        g.setColor(Color.LIGHT_GRAY);
        g.setColor(Color.WHITE);
        Random rand = new Random(); 
//   	 g2.fill(new Ellipse2D.Double(x[rand.nextInt(6)], rand.nextInt(180-65)+65, 5,5));
        int i =100;
        while(i-->0) {
        	g.fillOval(rand.nextInt(640), rand.nextInt(480), 5, 5);
        }
         g.setFont(new Font("Monospaced", Font.PLAIN, 12));
         g.drawString("Witer Is Comming", 20, 50);
     }

	

}
