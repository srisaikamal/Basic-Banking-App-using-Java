package BankingApplication;
import java.util.*;
public class AccountCreation {
	String name;
	int ac;
	void Account() {
		System.out.println("Welcome to Online Banking");
		System.out.println("----------------------------");
		Scanner a=new Scanner(System.in);
		System.out.println("Enter your name:");
		name=a.next();
		System.out.println("Enter your age: ");
		int age=a.nextInt();
		System.out.println("Your Unique Account number is: " +name+age);
		System.out.println("----------------------------");
	}
	void display() {
		System.out.println("Welcome "+name);
	}

}
