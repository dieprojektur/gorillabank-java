package gorillabankTest;

import gorillabank.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {
	
	@Test
	public void Can_open_account() {
		Account account= new Account(100);
		assertEquals(100, account.getBalance());		
	}
	
	
	@Test
	public void Can_pay_in_bananas() {
		Account account= new Account();
		account.payIn(1);
		account.payIn(101);
		account.payIn(100000000); // 100 mio
		
	}
	
	@Test
	public void Balance_increased_after_inpayment() {
		Account account= new Account();
		account.payIn(100);		
		assertEquals(100, account.getBalance());
	}

	@Test
	public void Can_pay_out() throws Exception {
		Account account = new Account(100);
		account.payOut(1);
		account.payOut(10);		
	}
	
	@Test
	public void Balance_decreased_after_outpayment () {
		Account account= new Account(100);
		account.payOut(10);		
		assertEquals(90, account.getBalance());
	}

	@Test
	public void Outpayment_beyond_limit_is_declined() {
		Account account= new Account(100);
		assertFalse(account.payOut(200));	
	}
	
}
