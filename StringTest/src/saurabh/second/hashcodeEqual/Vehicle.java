package saurabh.second.hashcodeEqual;

public class Vehicle {
	private String name;
	private int purchaseValue;
	public Vehicle() {
		
	}
	public Vehicle(String name, int purchaseValue) {
		this.name = name;
		this.purchaseValue = purchaseValue;
	}
	
	public void setPurchaseValue(int purchaseValue) {
		this.purchaseValue = purchaseValue;
	}
	/*public int hashcode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + purchaseValue;
		return result;
	}*/
	public int hashcode() {
		return 0;
	}
}
