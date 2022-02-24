
public class Fish extends Animals{

	public Fish(String animalType, int age, int weightInKg) {
		super(animalType, age, weightInKg);
		
	}
	
	public void breathing() {
		System.out.println("Fish is using gills to breath. ");
	}

	@Override
	public void move() {
		System.out.println("Fish is swimming. ");
	}
	
	
	

}
