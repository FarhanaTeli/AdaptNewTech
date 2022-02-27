package com.tns.application;
import com.tns.framework.CurrentAcc;
public class MMCurrentAcc extends CurrentAcc
{
	private static int accNo;
	private static String accNm;
	private static float accBal;
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) 
	{
		super(accNo, accNm, accBal, creditLimit);
	}
	public MMCurrentAcc()
	{
		super(accNo, accNm, accBal, creditLimit);
	}
	@Override
	public void withdraw(float accBal)
	{
		float withdrawn1=100;
		float accBal2;
		accBal2=accBal-withdrawn1;
		System.out.println("Dear Current Account user , your account balance is"+" "+accBal+" "+"and after withdrawal your account balance is"+" "+accBal2+" "+" with your Credit Limit "+creditLimit);
	}
	@Override
	public String toString() {
		return "MMCurrentAcc [getCreditLimit()=" + getCreditLimit() + ", toString()=" + super.toString()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
