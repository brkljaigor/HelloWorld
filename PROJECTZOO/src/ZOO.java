
public class ZOO {

	public static void main(String[] args) {
		Fish fish1 = new Fish ("Saran", 10, 5);
		Sparrow sparrow1 = new Sparrow("Vrapcic", 2, 1);
		Chicken chicken1 = new Chicken("Pile", 1, 1);
		
		sparrow1.fly();
		chicken1.fly();
		
		
		moveAnimal(sparrow1);
		moveAnimal(fish1);
		
	}
	
	public static void moveAnimal(Animals animal) {
		animal.move();
	}

}
