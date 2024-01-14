package codesoft.AtmInterface;

import java.util.Scanner;

class BankAccount {

	private static int balance;
	
	static {
		balance = 3000;
	}
	public void balanceAccount() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to XYZ ATM");
		
		do {
			System.out.println("\nMenu\n1.Balance\n2.Widrawal\n3.Deposite");
			int choice = scanner.nextInt();
			
			if(choice == 1) {
				
				System.out.println("Your Account Balance Is = $"+BankAccount.balance);
			
			}
			else if(choice == 2) {
				
				System.out.println("You want to Widrawal from Account\n");
				System.out.println("Please enter Amount to Widrawal");
				int widrawal = scanner.nextInt();
				
				try {
					int Amount = WidrawalAmount(widrawal);
					System.out.println("Balance After Widrawal = $" + Amount);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			else if(choice == 3) {
				
				System.out.println("You want to Deposite from Account\n");
				System.out.println("Please enter Amount to Deposite");
				int Deposite = scanner.nextInt();
				
				System.out.println("Balance After Deposite = $"+DepositeAmount(Deposite));
			}
			else {
				System.out.println("Please enter right choice");
			}
			System.out.println("Thank You for using XYZ ATM\n");
			System.out.println("Do You want to continew press 0");
			
			}while(scanner.nextInt() == 0);
		
	}
			
		public static int WidrawalAmount( int amount) throws Exception {
			
			if(amount>balance) {
				throw new Exception("Insufficient balance");
			}
			else {
				
				balance = balance - amount;
				
				return balance;
			}
		}

		public static int DepositeAmount(int amount) {
	
			balance = balance + amount;
	
			return balance;
		}
	
	}

public class AtmInterface {
	
	public static void main(String[] args) {
		
		BankAccount bankAccount = new BankAccount();
		bankAccount.balanceAccount();
	
	}
}

