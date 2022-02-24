
public class Sparrow extends Bird implements Flyable{

	public Sparrow(String animalType, int age, int weightInKg) {
		super(animalType, age, weightInKg);
	}

	@Override
	public void fly() {
		System.out.println("Sparrows can fly. ");
	}
	

}
