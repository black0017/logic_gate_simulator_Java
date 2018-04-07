package com.nick;

abstract class Gate {
	int rowPos ;
	int colPos ;
	abstract void Operate( Pin p1 , Pin p2 , Pin Out ) ;
	
    //gui
	void setPos( int rowPos , int colPos ) {
		this.rowPos = rowPos ;
		this.colPos = colPos ;		
	}
	void setPos(int rowPos ) {
		this.rowPos = rowPos ;
	}
	int getRowPos( ) {
		return this.rowPos ;
	}
	int getColPos( ) {
		return this.colPos ;
	}
	
	
	
	
	
}
