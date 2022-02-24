
public class Chicken extends Bird implements Flyable{

	public Chicken(String animalType, int age, int weightInKg) {
		super(animalType, age, weightInKg);
	}

	@Override
	public void fly() {
		System.out.println("Unlike sparrow chicken can not fly. ");
	}
	
	
	
}
