import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$' ###,##0.00");
	private int customerNumber = 0;
	private int pinNumber = 0;
	private double checkingBalance = 0;
	private double savingBalance = 0;

	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}

	public int getPinNumber() {
		return pinNumber;
	}

	public double getCheckingBalance() {
		return checkingBalance;
	}

	public double getSavingBalance() {
		return savingBalance;
	}

	public double calcCheckingWithdrawal(double ammount) {
		checkingBalance = (checkingBalance - ammount);
		return checkingBalance;
	}

	public double calcSavingWithdrawal(double ammount) {
		savingBalance = (savingBalance - ammount);
		return savingBalance;
	}

	public double calcCheckingDeposit(double ammount) {
		checkingBalance = (checkingBalance + ammount);
		return checkingBalance;
	}

	public double calcSavingDeposit(double ammount) {
		savingBalance = (savingBalance + ammount);
		return savingBalance;
	}

	public void getCheckingWithdrawalInput() {
		System.out.println("Checking account balance: " + moneyFormat.format(checkingBalance));
		System.out.println("Ammount you want to withdraw: ");
		double ammount = input.nextDouble();
		if ((checkingBalance - ammount) >= 0) {
			calcCheckingWithdrawal(ammount);
			System.out.println("New checking account balance: " + moneyFormat.format(checkingBalance));
		}else {
			System.out.println("Balance must be positive! ");
		}
	}
	
	public void getSavingWithdrawalInput() {
		System.out.println("Saving account balance: " + moneyFormat.format(savingBalance));
		System.out.println("Ammount you want to withdraw: ");
		double ammount = input.nextDouble();
		if ((savingBalance - ammount) >= 0) {
			calcSavingWithdrawal(ammount);
			System.out.println("New saving account balance: " + moneyFormat.format(savingBalance));
		}else {
			System.out.println("Balance must be positive! ");
		}
	}
	
	public void getCheckingDepositInput() {
		System.out.println("Checking account balance: " + moneyFormat.format(checkingBalance));
		System.out.println("Ammount you want to deposit: ");
		double ammount = input.nextDouble();
		if ((checkingBalance + ammount) >= 0) {
			calcCheckingDeposit(ammount);
			System.out.println("New checking account balance: " + moneyFormat.format(checkingBalance));
		}else {
			System.out.println("Balance must be positive! ");
		}
	}
	
	public void getSavingDepositInput() {
		System.out.println("Saving account balance: " + moneyFormat.format(savingBalance));
		System.out.println("Ammount you want to deposit: ");
		double ammount = input.nextDouble();
		if ((savingBalance + ammount) >= 0) {
			calcSavingDeposit(ammount);
			System.out.println("New saving account balance: " + moneyFormat.format(savingBalance));
		}else {
			System.out.println("Balance must be positive! ");
		}
	}
	

	

}
