package library.entities;

import static org.junit.Assert.*;
import library.interfaces.entities.EMemberState;

import org.junit.Test;

public class TestMemberMethodsTest {

	@Test
	public void testGetBorrwing() {
		
		Member member= new Member("Noor", "Ahmed", "000000","nn@yy.com", 1);
		EMemberState expResult= EMemberState.BORROWING_ALLOWED;
		TestMemberMethods instance=new TestMemberMethods();
		EMemberState result= instance.getBorrwing(member) ;
		assertEquals(expResult,result);
		

	}
	
	@Test
	public void testGetNames() {
		
		Member member= new Member("Noor", "Ahmed", "000000","nn@yy.com", 1);
		String expResult= "Noor Ahmed";
		TestMemberMethods instance=new TestMemberMethods();
		String result= instance.getNames(member) ;
		assertEquals(expResult,result);
		

	}
	@Test
	public void testTestaddFine() {
		Member member= new Member("Noor", "Ahmed", "000000","nn@yy.com", 1);
		float expResult= 10.0f;
		TestMemberMethods instance=new TestMemberMethods();
		float result= instance.testAddFine(member) ;
		
		assertEquals(expResult,result,0.001);
	}

}