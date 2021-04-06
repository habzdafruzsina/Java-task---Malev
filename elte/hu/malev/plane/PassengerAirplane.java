package elte.hu.malev.plane;

import java.util.ArrayList;

import elte.hu.malev.cargo.Cargo;
import elte.hu.malev.cargo.Person;
import elte.hu.malev.cargo.StaffPerson;
import elte.hu.malev.cargo.exception.InvalidCargo;

public class PassengerAirplane extends Airplane{
	
	private final StaffPerson staff;
	
	public PassengerAirplane(StaffPerson staff){
		super();
		this.staff = staff;
	}
	
	@Override
	public ArrayList<Cargo> listCargo(){
		ArrayList<Cargo> list = new ArrayList<Cargo>();
		for(Cargo c:cargos){
			list.add(c);
		}
		list.add(staff);
		return list;
	}
	
	@Override
	public boolean addCargo(Cargo c){
		try{
			Person p = (Person)c;
			staff.verifyPassenger(p);
			if(!cargos.contains(p)){
				cargos.add(p);
				return true;
			}
			return false;
		}catch(InvalidCargo e){
			System.err.println(e.getMessage());
			return false;
		}
	}
	
	public ArrayList<Person> findByName(String name){
		ArrayList<Person> list = new ArrayList<Person>();
		for(Cargo c:cargos){
			Person p = (Person)c;
			if(p.getName().equals(name)){
				list.add(p);
			}
		} return list;
	}

}