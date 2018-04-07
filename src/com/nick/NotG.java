package com.nick;

class NotG extends Gate {
	// p2 is always null
	void Operate( Pin p1 , Pin p2 ,Pin Out ) {
		int val = ( ( p1.getValue()==1 ) ? 0 : 1 ) ;
		Out.setValue( val ) ;
		
	}
	

}