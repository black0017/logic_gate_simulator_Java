package com.nick;

public class NorG extends Gate {
	void Operate(Pin p1 , Pin p2 , Pin Out ){
		//implementation with other made classes
		OrG oo = new OrG() ;
		oo.Operate( p1 , p2 , Out);
		
		NotG uu = new NotG() ;
		uu.Operate(Out, (Pin) null , Out);
		
	}
}
