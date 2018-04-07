package com.nick;

class OrG extends Gate {
	
	void Operate( Pin p1 , Pin p2 , Pin Out ) {
		int val = ( ( p2.getValue() != 0 ) || ( p1.getValue() != 0 ) ) ? 1 : 0;
		Out.setValue( val ) ;
	}
	
	    
}
