import java.io.IOException;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;


public class OptionMenu extends Account {
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$' ###,##0.00");

	HashMap<Integer, Integer> info = new HashMap<>();
	int selection;

	public void getLogin() throws IOException {
		int x = 1;

		do {
			try {
				info.put(9876543, 9876);
				info.put(8989898, 1890);

				System.out.println("Welcome to my ATM machine! ");

				System.out.println("Enter ID number: ");
				setCustomerNumber(menuInput.nextInt());

				System.out.println("Enter PIN: ");
				setPinNumber(menuInput.nextInt());
			} catch (Exception e) {
				System.out.println("\nInvalid values entered, you can type only number.\n");
				x = 2;
			}
			for (java.util.Map.Entry<Integer, Integer> entry : info.entrySet()) {
				if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()) {
					getAccountType();
				}
			}
			System.out.println("Wrong ID or PIN number! ");
			

		} while (x == 1);

	}

	public void getAccountType() {
		System.out.println("Select account you want to access: ");
		System.out.println("1 - Checking account");
		System.out.println("2 - Saving account");
		System.out.println("3 - Exit");
		System.out.println("Choice. ");

		selection = menuInput.nextInt();

		switch (selection) {
		case 1:
			getChecking();
			break;
		case 2:
			getSaving();
			break;
		case 3:
			System.out.println("Thank you for using my ATM machine! ");
			break;
		default:
			System.out.println("\nInvalid choice!\n");
			getAccountType();
		}

	}

	public void getChecking() {
		System.out.println("Checking account: ");
		System.out.println("1 - View balance");
		System.out.println("2 - Withdraw funds");
		System.out.println("3 - Deposit funds");
		System.out.println("4 - Exit");
		System.out.println("Choice");

		selection = menuInput.nextInt();

		switch (selection) {
		case 1:
			System.out.println("Checking account balance: " + moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
		case 2:
			getCheckingWithdrawalInput();
			getAccountType();
			break;
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Thank you for using my ATM machine! ");
			break;
		default:
			System.out.println("\nInvalid choice!\n");
		}
	}

	public void getSaving() {
		System.out.println("Saving account: ");
		System.out.println("1 - View balance");
		System.out.println("2 - Withdraw funds");
		System.out.println("3 - Deposit funds");
		System.out.println("4 - Exit");
		System.out.println("Choice");

		selection = menuInput.nextInt();

		switch (selection) {
		case 1:
			System.out.println("Checking account balance: " + moneyFormat.format(getSavingBalance()));
			getAccountType();
			break;
		case 2:
			getSavingWithdrawalInput();
			getAccountType();
			break;
		case 3:
			getSavingDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Thank you for using my ATM machine! ");
			break;
		default:
			System.out.println("\nInvalid choice!\n");
		}
	}
}
