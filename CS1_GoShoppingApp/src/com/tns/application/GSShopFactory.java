package com.tns.application;
import com.tns.framework.NormalAcc;
import com.tns.framework.ShopAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;
public class GSShopFactory implements ShopFactory
{

	@Override
	public PrimeAcc getNewPrimeAccount(int AccNo, String accNm, float charges, boolean isPrime) 
	{
		PrimeAcc prime=new PrimeAcc(AccNo, accNm, charges, isPrime);
		return prime;
	}

	@Override
	public NormalAcc getNewNormalAccount(int AccNo, String accNm, float charges, float deliveryCharge) 
	{
		NormalAcc normal=new NormalAcc(AccNo, accNm, charges, deliveryCharge);
		return normal;
	}	

}
