package saurabh.seventh.encapsulation;

public class Student {
	private String firstName;
	private String lastName;
	private int ID;
	private String standard;
	
	public Student() {
		
	}
	
	public Student(String firstName, String lastName, int ID, String standard) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ID = ID;
		this.standard = standard;
	}
	public String getName(){
		return this.firstName + " " + this.lastName;
	}
	public String getUniqueID() {
		return this.standard + this.ID;
	}
	public void setName(String firstName, String lastName) {
		if(firstName == null)
			throw new IllegalArgumentException("First name cannot be null");
		if(lastName == null)
			throw new IllegalArgumentException("Last name cannot be null");
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public void setUniqueID(String standard, int ID) {
		if(ID == 0)
			throw new IllegalArgumentException("Unique ID can't be 0");
		if(standard == null)
			throw new IllegalArgumentException("Standard can't be null");
		this.ID = ID;
		this.standard = standard;
	}
}
