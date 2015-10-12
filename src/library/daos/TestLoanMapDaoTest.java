package library.daos;

import static org.junit.Assert.*;
import library.interfaces.entities.ELoanState;

import org.junit.Test;

public class TestLoanMapDaoTest {

	@Test
	public void test() {
		
			
			boolean expResult=false;
			TestLoanMapDao instance=new TestLoanMapDao();
			boolean result=instance.testOverDue();
			assertEquals(expResult,result);
		

	}
	
	@Test
	public void test1() {
		
			
			ELoanState expResult=ELoanState.CURRENT;
			TestLoanMapDao instance=new TestLoanMapDao();
			ELoanState result=instance.testOverDue1();
			assertEquals(expResult,result);
		}

	@Test
	public void test2() {
		
			
			ELoanState expResult=ELoanState.COMPLETE;
			TestLoanMapDao instance=new TestLoanMapDao();
			ELoanState result=instance.testOverDue2();
			assertEquals(expResult,result);
		}
	
}


