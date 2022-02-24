
public class Bird extends Animals {

	public Bird(String animalType, int age, int weightInKg) {
		super(animalType, age, weightInKg);
	}

	@Override
	public void move() {
		System.out.println("Bird is flying.");
	}
	
	
	
}
