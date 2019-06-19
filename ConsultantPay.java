import java.util.*;
// 
// ConsultantPay.java 				Author: Debra Ragland			CPSC50100
//
// Test program to determine research consultant pay. Also a test to ensure that methods inherited from Person.java and PaidAdvisor.java
//		are working properly
//
public class ConsultantPay extends PaidAdvisor {

// Ask user to provide input, including name and how many hours they worked including any special hours
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter Your First Name: ");
		String firstName = scan.next();
		
		System.out.println("Please Enter Your Last Name: ");
		String lastName = scan.next();
		
		System.out.println("Enter the total number of hours you've worked: ");
		double baseHours = scan.nextDouble();
		
		System.out.println("Enter the total number of SPECIAL hours you've worked. If none, enter 0.: ");
		double overtime = scan.nextDouble();
		
// Store above input and return users' information based on input
		
		PaidAdvisor consultant = new PaidAdvisor();
		
		double rate = consultant.getPayRate();
		
		consultant.setNameRateHours(firstName, lastName, rate, baseHours, overtime);
		
		System.out.println("Your total wages are: " + "$" + consultant.calculatePay() );
		System.out.println(consultant.toString());	

		scan.close();
	}

}
