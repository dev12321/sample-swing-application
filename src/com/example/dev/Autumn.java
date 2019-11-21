package com.example.dev;
import java.awt. *;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class Autumn extends Canvas {
	
	 
	 @Override
     public void paint(Graphics g) {
        setBackground(Color.ORANGE);  // set background color for this JPanel

        // Your custom painting codes. For example,
        // Drawing primitive shapes
        g.setColor(Color.BLACK);    // set the drawing color
        //g.drawLine(30, 40, 100, 200);
        int x[]={120, 120,45};
        int y[]={490, 160,90};
        int n = 3;
        g.drawPolyline(x , y ,n);

        int asd[]={190,170,250};
        int b[]={490,160,70};
        int c = 3;
        g.drawPolyline(asd , b ,c);


        int h[]={490,500};
        int j[]={488,170};
        int k = 2;
        g.drawPolyline(h , j ,k);

        int i[]={570,560};
        int o[]={488,120};
        int p = 2;
        g.drawPolyline(i , o ,p);


        g.setColor(Color.BLACK);
        Random rand = new Random(); 
//  	 g2.fill(new Ellipse2D.Double(x[rand.nextInt(6)], rand.nextInt(180-65)+65, 5,5));
       int coun =20;
       while(coun-->0) {
          	g.fillOval(rand.nextInt(200), rand.nextInt(150), 30, 10);
          }
       coun = 20;
       while(coun-->0) {
          	g.fillOval(rand.nextInt(200)+400, rand.nextInt(150), 30, 10);
          }
        g.setFont(new Font("Monospaced", Font.PLAIN, 12));
        g.drawString("Autumn....", 10, 20);
     }

	

}
