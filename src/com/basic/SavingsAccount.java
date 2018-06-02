package com.basic;

public class SavingsAccount {
	public static int annualInterestRate;
	double savingsBalance;
	public SavingsAccount(double balance) {
		this.savingsBalance=balance;
	}
	public void calculateMonthlyInterest() {
		double interest=((savingsBalance*(annualInterestRate/100.0))/12);
		savingsBalance=savingsBalance+interest;
		
	}
	public static void modifyInterestRate(int newvalue) {
		annualInterestRate=newvalue;
		
	}
	public void displayBalance() {
		System.out.println(savingsBalance+savingsBalance);
	}
	public static void main(String args[]) {
		SavingsAccount sa1=new SavingsAccount(2000);
		SavingsAccount sa2=new SavingsAccount(3000);
		SavingsAccount.modifyInterestRate(4);
		sa1.displayBalance();
		sa2.displayBalance();
		sa1.calculateMonthlyInterest();
		sa2.calculateMonthlyInterest();
		sa1.displayBalance();
		sa2.displayBalance();
		SavingsAccount.modifyInterestRate(5);
		sa1.displayBalance();
		sa2.displayBalance();
		sa1.calculateMonthlyInterest();
		sa2.calculateMonthlyInterest();
		sa1.displayBalance();
		sa2.displayBalance();
		
		
	}

}
