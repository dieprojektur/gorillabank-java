
package gorillabank;

public class Bank {

	private int capital = 0; 
	
	/***
	 * @return Capital as sum of across all accounts 
	 */	
	public int getCapital() {
		return capital;	
	}
	
	/*** 
	 * Book keeping 
	 */
	public void book(int bananas) {
		capital += bananas;		
	}	
	
	public Account createAccount() {
		return new Account(this);
	}

	public Account createAccount(int bananas) {
		return new Account(this, bananas);
	}
}
