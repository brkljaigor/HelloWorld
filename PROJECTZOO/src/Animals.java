
public abstract class Animals {
	String animalType;
	int age;
	int weightInKg;
	
	
	public Animals(String animalType, int age, int weightInKg) {
		super();
		this.animalType = animalType;
		this.age = age;
		this.weightInKg = weightInKg;
	}


	public String getAnimalType() {
		return animalType;
	}


	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getWeightInKg() {
		return weightInKg;
	}


	public void setWeightInKg(int weightInKg) {
		this.weightInKg = weightInKg;
	}
	
	public void move() {
		
	}
	
	

}
