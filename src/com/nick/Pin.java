package com.nick;

class Pin {
	
	int pinValue ;

	Pin(  ){
		setValue(0) ;
		
	}
	
	void setValue( int pinValue ){
		this.pinValue = pinValue ;
	}
	
	int getValue(){
		return pinValue ;
		}


}
