package com.nick;

class Lgs {
    
	
   public static void main( String[] args ) {
	    Bread BB = new Bread() ;
		
		
		Circuit cc = new Circuit( BB ) ;
	    cc.addGate( new XorG()  , BB.pins[0][0] , BB.pins[1][0], BB.pins[3][3]) ;
		
		BB.show() ;
		Gui gg = new Gui( cc ) ;
		
	}

}
