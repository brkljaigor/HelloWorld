import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Dealership {

	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle("Honda", "Accord", 230, 20000);
		Vehicle vehicle2 = new Vehicle("Toyota", "Corola", 130, 13000);
		Vehicle vehicle3 = new Vehicle("BMW", "m3", 350, 45000);
		Vehicle vehicle4 = new Vehicle("Fiat", "500", 80, 11000);
		
		List<Vehicle> vehicleList = new ArrayList<>();
			vehicleList.add(vehicle1);
			vehicleList.add(vehicle2);
			vehicleList.add(vehicle3);
			vehicleList.add(vehicle4);
			
		String carBrand = null;
		List<String> carBrandList = vehicleList.stream().map(Vehicle::getBrand).collect(Collectors.toList());
		checkCarBrand(carBrandList, carBrand);

		Employee emp = new Employee();

		Customer cust1 = new Customer("Tom", "123 Nova Street, New York", 15000);
		Customer cust2 = new Customer("John", "23 New Street, Chicago", 20000);
		Customer cust3 = new Customer("Igor", "Random Street, Novi Sad", 11000);
		Customer cust4 = new Customer("Jack", "Random Street, Zrenjanin", 20000);

		cust1.isCustomerAbleToPurchaseCar(vehicle4, emp, true);

		cust2.isCustomerAbleToPurchaseCar(vehicle3, emp, true);

		cust3.isCustomerAbleToPurchaseCar(vehicle2, emp, false);

		cust4.isCustomerAbleToPurchaseCar(vehicle1, emp, false);

		

		

		

		

	}

	public static void checkCarBrand(List<String> carBrandList, String carBrand) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter car brand to check if it is available in dealership. ");
			carBrand = scanner.nextLine();
		}

		for (String name : carBrandList) {
			if (carBrand.equals(name)) {
				System.out.println("Yes it is available. ");
			}
		}
	}

}
