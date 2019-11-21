package com.example.dev;
import java.awt. *;
import java.awt.event.*; 
import javax.swing.*;
import com.example.dev.*;

public class Index  {
	

   
    public static void main(String[] args) {
    	
    	JFrame f = new JFrame("Main Panel");
    	JPanel panel=new JPanel(); 
    	
    	JButton Summer=new JButton("Summer");
    	
    	Summer.addActionListener(new ActionListener(){ 
    		 public void actionPerformed(ActionEvent e){  
    			 JFrame.setDefaultLookAndFeelDecorated(true);  
    			 JFrame frame = new JFrame("Summer Example");  
//    			 frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    		        frame.getContentPane().add(new Summer());
    		        frame.pack();
    		        frame.setSize(new Dimension(420, 400));
    		        frame.setVisible(true);
    		         }  
    		     }); 
    	 
    	 
    	JButton Winter=new JButton("Winter");
    	
    	Winter.addActionListener(new ActionListener(){ 
   		 public void actionPerformed(ActionEvent e){ 
   			JFrame.setDefaultLookAndFeelDecorated(true);  
			 JFrame frame = new JFrame("Winter Example");  
		        frame.setSize(640,480);  
//		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		       Winter w = new Winter();
		       w.setPreferredSize(new Dimension(640, 480));
		        frame.getContentPane().add(w);
		        frame.pack(); // Either pack() the components; or setSize()
		        frame.setTitle("Winter"); // "super" JFrame sets the title
		        frame.setVisible(true); // "super" JFrame show
   		         }  
   		     }); 
    	
    	JButton Rainy=new JButton("Rainy");
    	
    	Rainy.addActionListener(new ActionListener(){ 
   		 public void actionPerformed(ActionEvent e){
   			JFrame.setDefaultLookAndFeelDecorated(true);  
			 JFrame frame = new JFrame("Rainy Example"); 
//			 frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		        frame.getContentPane().add(new Rainy());
		        frame.pack();
		        frame.setSize(new Dimension(420, 400));
		        frame.setVisible(true);
		        
   		         }  
   		     }); 
    	
    	JButton Autumn=new JButton("Autumn");
    	Autumn.addActionListener(new ActionListener(){ 
   		 public void actionPerformed(ActionEvent e){
   			JFrame.setDefaultLookAndFeelDecorated(true);  
			 JFrame frame = new JFrame("Autumn Example");  
		        frame.setSize(640,480);  
//		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		        Autumn a = new Autumn();
		       a.setPreferredSize(new Dimension(640, 480));
		        frame.getContentPane().add(a);
		        frame.pack(); // Either pack() the components; or setSize()
		        frame.setTitle("Autumn"); // "super" JFrame sets the title
		        frame.setVisible(true); // "super" JFrame show
   		         }  
   		     }); 
    	
    	 Summer.setBounds(150,100,95,30);
    	 Winter.setBounds(300, 100, 95, 30);
    	 Rainy.setBounds(450, 100, 95, 30);
    	 Autumn.setBounds(600, 100, 95, 30);
    	 
    	  
    	
//    	Index m = new Index();
        
    	 f.add(Summer);
    	 f.add(Winter);
    	 f.add(Rainy);
    	 f.add(Autumn);
         panel.setBounds(50, 150, 900, 500);
         Winter w = new Winter();
         panel.setBackground(Color.white);
         panel.add(w);
         panel.setVisible(true);
        f.add(panel);
        f.setSize(1000, 1000);
        // f.setLayout(null);
        f.setVisible(true);
        
       
        
        
    }

}

   
 