package BankingApplication;

import java.util.Scanner;

public class Process {
	void process() {
        Scanner in = new Scanner(System.in);
        int userChoice;
        float balance = 0f;
        do {
              System.out.println("1. Deposit money");
              System.out.println("2. Withdraw money");
              System.out.println("3. Check balance");
              userChoice = in.nextInt();
              switch (userChoice) {
              case 1:
                    float amount;
                    System.out.print("Amount to deposit: ");
                    amount = in.nextFloat();
                    if (amount <= 0)
                         System.out.println("Can't deposit 0");
                    else {
                         balance += amount;
                         System.out.println( + amount + " has been deposited.");
                    }
                    break;
              case 2:
                    System.out.print("Amount to withdraw: ");
                    amount = in.nextFloat();
                    if (amount <= 0 || amount > balance)
                         System.out.println("Low balance.");
                    else {
                         balance -= amount;
                         System.out.println(+ amount + " has been withdrawn.");
                    }
                    break;
              case 3:
                    System.out.println("Your balance: " + balance);
                    break;
              default:
                    System.out.println("Wrong choice.");
                    break;
              }
              System.out.println();
        } while (userChoice>3);
        
	}
}