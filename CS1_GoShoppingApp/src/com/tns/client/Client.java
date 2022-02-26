package com.tns.client;
import com.tns.framework.PrimeAcc;
import com.tns.framework.NormalAcc;
import com.tns.framework.ShopAcc;
import com.tns.framework.ShopFactory;
import com.tns.application.GSNormalAcc;
import com.tns.application.GSPrimeAcc;
import com.tns.application.GSShopFactory;
public class Client 
{
	public static void main(String[] args)
	{  
		GSShopFactory gssfactory=new GSShopFactory();
		gssfactory.getNewNormalAccount(123, "Vikas", 700, 10);
		gssfactory.getNewPrimeAccount(111, "Vikas1", 800, true);
		
		GSPrimeAcc gsprime=new GSPrimeAcc();
		//gsprime.getAccNm();
		//gsprime.getAccNo();
		//gsprime.getCharges();
		gsprime.bookProduct(1000);
		gsprime.toString();
		
		GSNormalAcc gsnormal=new GSNormalAcc();
		//gsnormal.getAccNm();
		//gsnormal.getAccNo();
		//gsnormal.getCharges();
		//gsnormal.getDeliveryCharge();
		gsnormal.bookProduct(100);
		gsnormal.toString();


	}

}
