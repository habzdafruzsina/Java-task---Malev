package elte.hu.malev.cargo;

public class Person extends Cargo{
	
	private final String name;
	protected boolean checkedIn = false;
	
	protected Person(int id, String name){
		super(id);
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public static Person make(String name){
		return new Person(Cargo.nextId(), name);
	}
	
	public void checkIn() {checkedIn = true;}
	
	public boolean isCheckedIn(){ return checkedIn; }
	
	@Override
	public String toString(){
		if (isCheckedIn()){
			return "ID: " + super.getId() + " (" + name + ")"; 
		} else {
			return "Not checked in! ID: " + super.getId() + " (" + name + ")";
		}
	}
}