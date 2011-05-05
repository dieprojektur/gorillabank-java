package gorillabankTest;

import gorillabank.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class BananaAccountTest {
	
	@Test
	public void Can_open_account() {
		BananaAccount account= new BananaAccount(100);
		assertTrue(account != null);
		// get balance checken
	}
	
	
	@Test
	public void Can_pay_in_bananas() {
		BananaAccount account= new BananaAccount();
		account.payIn(1);
		account.payIn(101);
		account.payIn(100000000); // 100 mio
		
	}
	
	@Test
	public void Balance_increased_after_inpayment() {
		BananaAccount account= new BananaAccount();
		account.payIn(100);		
		assertEquals(100, account.getBalance());
	}

	@Test
	public void Can_pay_out() throws Exception {
		BananaAccount account = new BananaAccount(100);
		account.payOut(1);
		account.payOut(10);		
	}
	
	@Test
	public void Balance_decreased_after_outpayment () {
		BananaAccount account= new BananaAccount(100);
		account.payOut(10);		
		assertEquals(90, account.getBalance());
	}

	@Test(expected = Exception.class)
	public void Outpayment_beyond_limit_is_declined() {
		BananaAccount account= new BananaAccount(100);
		account.payOut(200);	
	}
	
}
