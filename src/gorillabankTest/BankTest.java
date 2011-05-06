package gorillabankTest;

import gorillabank.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankTest {
		
		Bank bank;
	
		@Before
		public void Setup() {
			bank = new Bank();
		}
		
		@After
		public void Cleanup() {
			bank = null;			
		}
					
			
		@Test
		public void Can_open_new_bank() {
			assertNotNull(bank);
		}
		
		@Test
		public void Capital_increases_after_pay_in() {
			Account account = bank.createAccount(100);
			account.payIn(100);
			assertEquals(bank.getCapital(), 200);
		}
		
		@Test
		public void Capital_decreases_after_pay_out() {
			Account account = bank.createAccount(100);
			int initialCapital = bank.getCapital();
			account.payOut(50);
			assertEquals(bank.getCapital(), initialCapital - 50);
		}				
}
