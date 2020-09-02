package controller;

import java.util.EventObject;

import model.Owner;

public class BoughtTicketsEvent extends EventObject{
	
	private Owner o;

	public BoughtTicketsEvent(Object source, Owner o) {
		super(source);
		this.o = o;
	}
	
	public Owner getO(){
		return o;
	}

}
