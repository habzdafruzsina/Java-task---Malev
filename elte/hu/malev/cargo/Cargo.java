package elte.hu.malev.cargo;

public abstract class Cargo{
	
	private final int id;
	
	private static int currentId=0;
	
	protected Cargo(int id){
		this.id = id;
	}
	
	protected static int nextId(){
		Cargo.currentId++;
		return Cargo.currentId;
	}
	
	abstract boolean isCheckedIn();
	
	@Override
	public boolean equals(Object o){
		if (o == null){
			return false;
		}
		if (o instanceof Cargo){
			Cargo that = (Cargo)o;
			if (that.getId() == this.getId()){
				return true;
			}
			return false;
		}
		return false;
	}
	
	@Override
	public int hashCode(){
		return id;
	}
	
	@Override
	public String toString(){
		if (isCheckedIn()){
			return "ID: " + id; 
		} else {
			return "Not checked in! ID: " + id;
		}
	}
	
	public int getId() {return id;}
	
}