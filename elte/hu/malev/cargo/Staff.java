package elte.hu.malev.cargo;

import elte.hu.malev.cargo.exception.InvalidCargo;

public interface Staff{
	void verifyPassenger(Person p) throws InvalidCargo;
}