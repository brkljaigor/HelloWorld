
public class Vehicle {

	private String brand;
	private String model;
	private int hp;
	private double price;

	public Vehicle(String brand, String model, int hp, double price) {
		this.brand = brand;
		this.model = model;
		this.hp = hp;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", model=" + model + ", hp=" + hp + ", price=" + price + "]";
	}

}
