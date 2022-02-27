package com.tns.framework;
public class SavingAcc extends BankAcc
{
	public static boolean isSalaried;
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried=isSalaried;
	}
	public boolean isSalaried() {
		return isSalaried;
	}
	
	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}
	@Override
	public void withdraw(float accBal)
	{
		System.out.println("Your account balance is: "+accBal);
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getAccBal()=" + getAccBal() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
}
