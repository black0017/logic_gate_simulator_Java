package com.nick;


import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import javax.swing.*  ;

public class Gui extends JFrame {
	
	private static final long serialVersionUID = 1L; // autofill from eclipse

	Gui( Circuit circuit ){
	    super("Grid") ;
	    this.setVisible(true) ;
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setSize(800, 600 );
	    JPanel p = new JPanel() ;
	    p.setLayout( new GridLayout( 11 , 6 , 5 , 5) );
	    JLabel l1 = new JLabel("abg1") ;
	    JButton b2 = new JButton("qwe") ;
	    JButton b11 = new JButton("qwe") ;
	    //b2.setIcon( defaultIcon );
	    p.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT );
	    p.add(l1) ;
	    p.add(b2) ;
	    p.add(b11) ;
	    
	    this.add(p)  ;
	
	}	
}
