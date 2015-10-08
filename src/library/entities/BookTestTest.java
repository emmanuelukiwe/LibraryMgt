package library.entities;

import static org.junit.Assert.*;
import library.interfaces.entities.EBookState;

import org.junit.Test;

public class BookTestTest {

	@Test
	public void testTestLose() {
		BookTest instance=new BookTest();
		EBookState expResult=EBookState.LOST;
		EBookState result=instance.testLose();
		assertEquals(expResult,result);
		
	}

	
	@Test
	public void testTestDispose() {
		BookTest instance=new BookTest();
		EBookState expResult=EBookState.DISPOSED;
		EBookState result=instance.testDispose();
		assertEquals(expResult,result);
		
	}
	@Test
	public void testTestDamage() {
		BookTest instance=new BookTest();
		EBookState expResult=EBookState.DAMAGED;
		EBookState result=instance.testDamage();
		assertEquals(expResult,result);
		
	}
	
	@Test
	public void testTestRepair() {
		BookTest instance=new BookTest();
		EBookState expResult=EBookState.AVAILABLE;
		EBookState result=instance.testRepair();
		assertEquals(expResult,result);
		
	}
	
}
