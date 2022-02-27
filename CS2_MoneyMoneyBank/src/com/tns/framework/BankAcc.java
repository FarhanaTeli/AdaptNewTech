package com.tns.framework;
public abstract class BankAcc 
{
	protected int accNo;
	protected String accNm;
	private float accBal;
	public BankAcc(int accNo, String accNm, float accBal) {
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	public int getAccNo() {
		return accNo;
	}
	
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public float getAccBal() {
		return accBal;
	}
	public void deposite(float totalDeposite,float accBal)
	{
		System.out.println("Balance after deposite: "+(accBal+totalDeposite));
	}
	public void withdraw(float withdrawn)
	{
		System.out.println("Balance after withdrawal: "+(accBal-withdrawn));
	}
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
