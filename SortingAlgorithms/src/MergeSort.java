import java.util.Random;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		int[] numbers = new int[100];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100);
		}
		
		System.out.println("Before: ");
		printArray(numbers);
		
		mergeSort(numbers);
		
		System.out.println("After: ");
		printArray(numbers);
		

	}
	
	private static void mergeSort(int[] inputArray) {
		int inputLenght = inputArray.length;
		
		if(inputLenght < 2) {
			return;
		}
		//getting mid index for both halves
		int midIndex = inputLenght / 2;
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[inputLenght - midIndex];
		
		//populating halves
		for (int i = 0; i < midIndex; i++) {
			leftHalf[i] = inputArray[i];
		}
		
		for (int i = midIndex; i < inputLenght; i++) {
			rightHalf[i - midIndex] = inputArray[i];
		}
		
		mergeSort(leftHalf);
		mergeSort(rightHalf);
		
		merge(inputArray, leftHalf, rightHalf);
		
	}
	
	private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
		int leftSize = leftHalf.length;
		int rightSize = rightHalf.length;
		
		int i = 0, k = 0, j = 0;
		while(i < leftSize && j < rightSize) {
			if(leftHalf[i] <= rightHalf[j]) {
				inputArray[k] = leftHalf[i];
				i++;
			}else {
				inputArray[k] = rightHalf[j];
				j++;
			}
			k++;
		}
		
		while(i < leftSize) {
			inputArray[k] = leftHalf[i];
			i++;
			k++;
		}
		
		while(j < rightSize) {
			inputArray[k] = rightHalf[j];
			j++;
			k++;
		}
		
		
	}
	
	private static void printArray(int[] numbers) {
		for( int j = 0; j < numbers.length; j++) {
			System.out.println(numbers[j]);
		}
	}

}
