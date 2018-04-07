package com.comp;

public class AndG extends Gate {
	
	void Operate( Pin p1 , Pin p2 , Pin Out ) {
		 Out.setValue(p1.getValue()*p2.getValue()) ;	
	}

}
