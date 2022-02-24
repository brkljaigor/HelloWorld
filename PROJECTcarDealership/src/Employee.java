
public class Employee {

	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
		if (vehicle.getPrice() <= cust.getMoney()) {
			processTrans(cust, vehicle);
		} else if (finance == true) {
			double loanAmmount = vehicle.getPrice() - cust.getMoney();
			runCreditHistory(cust, loanAmmount);
		} else {
			System.out.println(cust.getName() + " needs more money, and he is not eligible for loan. ");
		}
	}

	public void runCreditHistory(Customer cust, double loanAmmount) {
		System.out.println("Running credit history for " + cust.getName());
		System.out.println("Credit has been approved. ");
	}

	public void processTrans(Customer cust, Vehicle vehicle) {
		System.out.println(cust.getName() + " has purchased the vehicle " + vehicle + "for the price " + vehicle.getPrice());
	}

}