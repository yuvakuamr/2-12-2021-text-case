package org.Inheritance;



//Child1 
public class User2Details extends CompanyDetails {
	
	public void userName1() {
		
		System.out.println("My Name is : Yuva Kumar");

	}
	public void userId1() {
		
		System.out.println("My Id is : 8525");
		

	}
	public void userMblNo1() {
	
		System.out.println("My Mobile Number : 9500687425");


	}
	public static void main(String[] args) {
		
		User2Details u = new User2Details();
		
		u.companyName();
		u.clintName();
		u.userName1();
		u.userId1();
		u.userMblNo1();
	}

}
