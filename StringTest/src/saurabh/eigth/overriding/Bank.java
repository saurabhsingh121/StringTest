package saurabh.eigth.overriding;

public class Bank {
	private int no = 100;
	public int pubNo = 150;
	private void deposite() {
		System.out.println("Deposite method");
	}
	
	protected void withdraw() {
		System.out.println("Withdraw method");
	}
	void getDetail() {
		System.out.println("Get detail method");
	}
}
