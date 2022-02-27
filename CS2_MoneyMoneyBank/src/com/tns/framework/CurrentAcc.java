package com.tns.framework;
public class CurrentAcc extends BankAcc
{
	protected static float creditLimit;
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit=creditLimit;
	}
	public float getCreditLimit() {
		return creditLimit;
	}
	@Override
	public void withdraw(float accBal)
	{
		System.out.println("Your account balance is: "+accBal);
	}
	@Override
	public String toString() {
		return "CurrentAcc [getCreditLimit()=" + getCreditLimit() + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getAccBal()=" + getAccBal() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
