package com.tns.client;

import com.tns.application.MMBankFactory;
import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;
import com.tns.framework.BankFactory;
import com.tns.framework.BankAcc;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class Client {
	static MMSavingAcc sa;
	static MMCurrentAcc ca;
	static BankFactory bf;

	public static void main(String[] args) {
		/*
		 * bf=new MMBankFactory(); sa= (MMSavingAcc) bf.getNewSavingAccount(101, "Zain",
		 * 1000, true); sa.withdraw(100); sa.toString();
		 * 
		 * ca= (MMCurrentAcc) bf.getNewCurrentAccount(102, "Zoya", 10000, 1000 );
		 * ca.withdraw(100); ca.toString();
		 */
		
		  MMBankFactory mmbank=new MMBankFactory(); 
		  mmbank.getNewCurrentAccount(101,"Zain", 10000, 1000); 
		  MMCurrentAcc mmcurrent=new MMCurrentAcc();
		  mmcurrent.withdraw(10000);
		  mmcurrent.toString();
		  mmbank.getNewSavingAccount(102, "Zoya", 1000, false);
		  MMSavingAcc mmsaving=new MMSavingAcc();
		  mmsaving.withdraw(2000);
		  mmsaving.toString();
		 

	}

}
