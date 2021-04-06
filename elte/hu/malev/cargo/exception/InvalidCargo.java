package elte.hu.malev.cargo.exception;

import elte.hu.malev.cargo.Cargo;

public class InvalidCargo extends Exception{
	
	public InvalidCargo(int id){
		super("Invalid cargo with ID: " + id);
	}
	
	public InvalidCargo(Cargo c){
		super("Invalid cargo with ID: " + c.getId() );
	}

}