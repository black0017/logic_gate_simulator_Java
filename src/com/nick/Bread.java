package com.nick;

class Bread{ 
	//throws NullPointerException 
	static final  int rows = 10 ;
	static final  int cols = 4 ;
	
	Pin[][]  pins ; 
	
	Bread(  ) {
		this.pins = new Pin[rows][cols] ; //desmeuei xwro
		for( int t = 0 ; t < cols ; t++ ){
			for( int r = 0 ; r < rows ; r++  ){
				this.pins[r][t] = new Pin() ;
				
			}
		}

	}
	//vazw tash
	void setIn( int row , int value ){ // index of pin 
		this.pins[row][0].setValue( value ) ;
	}
	
	void getOut(int row ){ // index of out
		System.out.println( pins[row][3].getValue()  ) ;
	}	
	
	
	
	
	void show() {
		for( int r = 0 ; r < rows ; r++  ){
			for( int t = 0 ; t < cols ; t++ ){
				System.out.print( pins[r][t].getValue() +"\t"  ) ;
			}
			System.out.println( "\n"  ) ;
		}
	
	}
	
}
