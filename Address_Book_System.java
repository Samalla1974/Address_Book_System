package usecases;

import java.util.Scanner;

 public class Address_Book_System
 {
public static void main(String[] args) {
	 
Scanner sc = new Scanner (System.in);  
int zip= sc.nextInt();  
int number= sc.nextInt();
String first_name= sc.nextLine();
System.out.println("first_name");
String last_name= sc.nextLine();
System.out.println("last_name");
String address= sc.nextLine();
System.out.println("address");
String city = sc.nextLine();
System.out.println("city");
String state= sc.nextLine();
System.out.println("state");
String email= sc.nextLine();    
System.out.println("email");
	}

void addAPerson() {
	System.out.print("Enter first and last name: ");
	Scanner sc = new Scanner (System.in);  
	String firstName = sc.nextLine();
	String lastName = sc.next();
	
	System.out.print("Enter complete address: ");
	String address = sc.nextLine();
	
	System.out.print("Enter city, state and zip: ");
	String city = sc.next();
	String state = sc.next();
	String zip =sc.next();
	
	System.out.println("Enter phone number: ");
	String phoneNumber = sc.nextLine();
}
	
	void edit() {
		contacts e=new contacts();
		System.out.println("What do you want to edit?");
		System.out.println("1. Address");
		System.out.println("2. Phone Number");
		
		Scanner sc = new Scanner (System.in);  
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.print("Enter address: ");
			sc.nextLine();
			
			String address = sc.nextLine();
			System.out.print("Enter city, state and zip: ");
			String city = sc.nextLine();
			String state = sc.next();
			String zip = sc.next();
			break;

		case 2:
			System.out.println("Enter phone number: ");
			String phoneNumber = sc.next();
			e.put("phone",phoneNumber);
			break;
			
			
			e.put("Address", address);
			e.put("City", city);
			e.put("State", state);
			e.put("Zip", zip);
			break;

		}
}
}
}
