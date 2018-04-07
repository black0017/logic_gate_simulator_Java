package com.nick;

class NandG extends Gate {
	//implementation1
	void Operate( Pin p1 , Pin p2 , Pin Out ) {
		Out.setValue( (( (p2.getValue()) + (p1.getValue()) <2 ) ? 1 : 0) ) ;
		
	}
	//implementation2 with and +not

}