package com.tns.application;
import com.tns.framework.NormalAcc;
public class GSNormalAcc extends NormalAcc
{
	private static float charges;
	private static String accNm;
	private static int accNo;
	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) 
	{
		super(accNo, accNm, charges, deliveryCharge);
		// TODO Auto-generated constructor stub
	}
	public GSNormalAcc() 
	{
		super(accNo, accNm, charges, deliveryCharge );
	}
	@Override
	public void bookProduct(float charges) 
	{
		System.out.println("Dear Normal User, Your Charges are:" +charges+" "+"with Delivery Charges is: "+deliveryCharge);
	}

	@Override
	public String toString() 
	{
		return "GSNormalAcc [accNo=" + accNo + ", accNm=" + accNm + ", toString()=" + super.toString()
				+ ", getDeliveryCharge()=" + getDeliveryCharge() + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getCharges()=" + getCharges() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
}
