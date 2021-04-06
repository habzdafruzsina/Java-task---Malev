package elte.hu.malev.cargo;

import elte.hu.malev.cargo.exception.InvalidCargo;

public class StaffPerson extends Person implements Staff{
	
	private StaffPerson(int id, String name){
		super(id, name);
		checkedIn = true;
	}
	
	@Override
	public void verifyPassenger(Person p) throws InvalidCargo{
		if (!p.isCheckedIn()){
			throw new InvalidCargo(p);
		}
	}
	
}