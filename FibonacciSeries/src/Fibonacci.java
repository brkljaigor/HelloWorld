import java.util.Scanner;

public class Fibonacci {

	private static long[] fibonacciCache;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		System.out.println("Chose n-th number to return from fibonacci series. ");
		
		int n = userInput.nextInt();
		fibonacciCache = new long[n + 1];
		// n = 92 is limit because of long limitation
		System.out.println(fibonacci(n));
		
		
		
		}
	
	//using memoization to make algo faster
	private static long fibonacci(int n) {
		if(n <= 1) {
			return n;
		}
		
		if(fibonacciCache[n] != 0) {
			return fibonacciCache[n];
		}
		
		long nthFinobanacciNumber = (fibonacci(n - 1) + fibonacci(n - 2));
		fibonacciCache[n] = nthFinobanacciNumber;
		return nthFinobanacciNumber;
		

	}

}
