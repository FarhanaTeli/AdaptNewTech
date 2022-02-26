package com.tns.application;
import com.tns.framework.PrimeAcc;
public class GSPrimeAcc extends PrimeAcc
{
	 private static final float charges=0; 
	 private static String accNm; 
	 private static int accNo;
	 public float getCharges() 
	 { 
		 return charges;
	 }
	 
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}
	public GSPrimeAcc() 
	{
		super(accNo, accNm, charges, isPrime);
	}
	@Override
	public void bookProduct(float charges) 
	{
		System.out.println("Dear Prime User, Your Product Charges are: "+charges);
	}
	@Override 
	public String toString() 
	{
	 return "GSPrimeAcc []";
	}
}
