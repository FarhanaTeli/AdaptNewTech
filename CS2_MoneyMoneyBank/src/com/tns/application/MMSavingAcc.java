package com.tns.application;

import com.tns.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc
{
	private static final float MINBAL=1000;
	private static float accBal;
	private static String accNm;
	private static int accNo;
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) 
	{
		super(accNo, accNm, accBal, isSalaried);
	}
	public MMSavingAcc()
	{
		super(accNo, accNm, accBal, isSalaried);
	}
	public static float getMinbal() {
		return MINBAL;
	}
	@Override
	public void withdraw(float accBal)
	{
		float withdrawn=100;
		float accBal1;
		accBal1=accBal-withdrawn;
		System.out.println("Dear Saving Account user, your account balance is"+" "+accBal+" "+"and after withdrawal your account balance is "+accBal1+" "+"with your minimum balance "+MINBAL);
	}
	@Override
	public String toString() {
		return "MMSavingAcc [isSalaried()=" + isSalaried() + ", toString()=" + super.toString() + ", getAccNo()="
				+ getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
