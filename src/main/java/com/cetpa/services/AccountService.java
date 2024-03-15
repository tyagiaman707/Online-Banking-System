package com.cetpa.services;

import com.cetpa.entities.Account;
import com.cetpa.entities.TransactionSummary;

public interface AccountService 
{
	Account getAccount(String userid);
	int getAmount(int accountno);
	void updateAmount(TransactionSummary summary);
	boolean debitAmount(TransactionSummary summary);
	Account getAccount(int accountno);
}
