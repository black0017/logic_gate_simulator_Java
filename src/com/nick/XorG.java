package com.nick;


class XorG extends Gate {

	void Operate( Pin p1 , Pin p2 , Pin Out ) {
		int val = ( p2.getValue() != p1.getValue() ) ? 1 : 0;
		 Out.setValue( val ) ;
	}
	

}
