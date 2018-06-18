package saurabh.eigth.overriding;

import java.sql.Savepoint;

public class SavingAc extends Bank{

	public void deposite() {
		System.out.println("Deposite method");
	}
	@Override
	public void withdraw() {
		super.withdraw();
	}
	@Override
	public void getDetail() {
		super.getDetail();
		System.out.println("In saving ac class");
	}
	void display() {
		System.out.println(super.pubNo);
		System.out.println();
	}
	public static void main(String[] args) {
		Bank bank = new SavingAc();
		bank.withdraw();
		bank.getDetail();
		System.out.println();
		SavingAc saving = new SavingAc();
		saving.deposite();
		saving.withdraw();
		saving.getDetail();
		saving.display();
	}
}
