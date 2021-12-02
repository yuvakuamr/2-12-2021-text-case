package org.Inheritance;

//Child 
public class UserDetails extends CompanyDetails {
	
	public void uesrName() {
		
		System.out.println("My Name is : Dhinakaran ");

	}
	
	public void userId() {
		
		System.out.println("My Id is : 12345");

	}
	
	public void userMblNo() {
		
		System.out.println("My Mobile Number : 9994063012");

	}
	public static void main(String[] args) {
		UserDetails u = new UserDetails();
		
		u.companyName();
		u.clintName();
		u.uesrName();
		u.userId();
		u.userMblNo();
	}

}
