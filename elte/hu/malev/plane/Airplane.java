package elte.hu.malev.plane;

import java.util.ArrayList;

import elte.hu.malev.cargo.Cargo;

public class Airplane{
	
	protected final ArrayList<Cargo> cargos; //??? private -nek kéne lennie a leírás szerint, de úgy nem mûködne a passengerairplane
	
	public Airplane(){
		cargos = new ArrayList<Cargo>();
	}
	
	public boolean addCargo(Cargo c){
		if(!cargos.contains(c)){
			cargos.add(c);
			return true;
		}
		return false;
	}
	
	public ArrayList<Cargo> listCargo(){
		ArrayList<Cargo> list = new ArrayList<Cargo>();
		for(Cargo c:cargos){
			list.add(c);
		}
		return list;
	}
	
	public Cargo find(int id){
		for(Cargo c:cargos){
			if(c.getId() == id){
				return c;
			}
		}
		return null;
	}
	
}