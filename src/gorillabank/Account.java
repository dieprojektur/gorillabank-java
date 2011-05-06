/*
   _____            _ _ _        ______             _    
  |  __ \          (_) | |       | ___ \           | |   
  | |  \/ ___  _ __ _| | | __ _  | |_/ / __ _ _ __ | | __
  | | __ / _ \| '__| | | |/ _` | | ___ \/ _` | '_ \| |/ /
  | |_\ \ (_) | |  | | | | (_| | | |_/ / (_| | | | |   < 
   \____/\___/|_|  |_|_|_|\__,_| \____/ \__,_|_| |_|_|\_\ 

   If Gorillas had a bank ...

*/                                                      
package gorillabank;

public class Account {

	private Bank bank;
	private int bananas = 0;
	private int limit = 0;
		
	/**
	 * Create new account with initial in-payment of bananas 
	 */
	protected Account(Bank bank, int bananas) {
		this.bananas = bananas;
		this.bank = bank;
		bank.book(bananas);
	}
		
	protected Account(Bank bank) {
		this.bank = bank; 
	}

	/**
	 * Pay in bananas  
	 */
	public void payIn(int bananas) {
		this.bananas += bananas;
		bank.book(bananas);
	}

	/**
	 * Pay out bananas 
	 */
	public boolean payOut(int bananas) {
		int newBalance = this.bananas - bananas; 		
		if (newBalance >= limit) { 
			this.bananas -= bananas;
			bank.book(-bananas);
			return true;
		}		
		return false;
	}
	
	/***
	 * Returns account balance (number of bananas)
	 */
	public int getBalance() {
		return bananas;
	}

}
