package org.system;

public class BankInfo extends AxisBank{

	public void saving() {
		// TODO Auto-generated method stub
		System.out.println("saving");

	}
	public void fixed() {
		// TODO Auto-generated method stub
		System.out.println("fixed");

	}
	public void deposit() {
		// TODO Auto-generated method stub
          System.out.println("deposit IN BANK INFO");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankInfo obj =new BankInfo();
		obj.saving();
		obj.fixed();
		obj.deposit();
		
		

	}

}
