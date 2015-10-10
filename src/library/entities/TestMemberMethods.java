package library.entities;

import library.interfaces.entities.EMemberState;

public class TestMemberMethods {
	
	public EMemberState getBorrwing(Member member){
		return member.getState();
		
	}
	
	public String getNames(Member member){
		System.out.println(member.getFirstName() + " " + member.getLastName());
		return member.getFirstName() +" " + member.getLastName();
	}
	
	
	public float testAddFine(Member member){
		
		 member.addFine(10.0f);
		 System.out.println(member.getFineAmount());
		 return member.getFineAmount();
	}
	
	
	
}
