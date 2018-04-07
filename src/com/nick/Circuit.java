package com.nick;



class Circuit {

	
	Circuit( Bread BB  ) {
		//handcoded circuit is builded here version 1
		
		//INPUTS   setIn( row , value0-1 )
				BB.setIn( 0 , 0 )  ;
				BB.setIn( 1 , 1 )  ;
				BB.setIn( 2 , 0 )  ;
				BB.setIn( 3 , 1 )  ;
				
		//addGate( GatE , PiN-In , PiN-In , PiN-Out ,)
		addGate( new XorG()  , BB.pins[0][0] , BB.pins[1][0], BB.pins[0][1]) ;
		addGate( new NandG() , BB.pins[1][0] , BB.pins[2][0], BB.pins[1][1]) ;
		addGate( new NotG()  , BB.pins[2][0] ,  (Pin) null  , BB.pins[2][1]) ; //type casting
		addGate( new AndG()  , BB.pins[1][0] , BB.pins[3][0], BB.pins[5][1]) ;
		addGate( new OrG()   , BB.pins[3][0] , BB.pins[4][0], BB.pins[6][1]) ;
		addGate( new NorG()   , BB.pins[7][0] , BB.pins[8][0], BB.pins[9][1]) ;
		
		
	}
	
	// MIPWS AUTO PREPEI NA GINETAI MONO STO RUN ?????
	void addGate( Gate gg , Pin p1 , Pin p2 , Pin p3 ) {
		
		gg.Operate( p1 , p2 , p3 )  ;
	}
	
	void Run() {
		//later version
	}
	
}
