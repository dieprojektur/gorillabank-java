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

public class Bank {

	private int capital = 0; 
	
	/***
	 *  Get capital as sum across all accounts 
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
	
	/***
	 * Created new account at this bank  
	 */
	public Account createAccount() {
		return new Account(this);
	}

	/***
	 * Created new account at this bank with initial in-payment  
	 */
	public Account createAccount(int bananas) {
		return new Account(this, bananas);
	}
}
