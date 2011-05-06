package gorillabank;

public class Account {

	private int bananas = 0;
	private int limit = 0;
		
	/**
	 * Create new account with initial in-payment of bananas 
	 */
	public Account(int bananas) {		
		this.bananas = bananas; 
	}
		
	public Account() {
		// nothing to do here. 
	}

	/**
	 * Pay in bananas  
	 */
	public void payIn(int bananas) {
		this.bananas += bananas;
	}

	/**
	 * Pay out bananas 
	 */
	public boolean payOut(int bananas) {
		int newBalance = this.bananas - bananas; 		
		if (newBalance >= limit) { 
			this.bananas = newBalance;
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
