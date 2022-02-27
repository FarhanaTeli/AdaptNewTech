package com.tns.application;

import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;
public class MMBankFactory implements BankFactory
{
	@Override
	public SavingAcc getNewSavingAccount(int AccNo, String accNm, float accBal, boolean isSalaried) 
	{
		SavingAcc saving=new SavingAcc(AccNo, accNm, accBal, isSalaried);
		return saving;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int AccNo, String accNm, float accBal, float creditLimit) 
	{
		CurrentAcc current=new CurrentAcc(AccNo, accNm, creditLimit, creditLimit);
		return current;
	}

}
