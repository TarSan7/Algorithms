package pack;

import java.util.Random;

public class main {
	static int n = 20000;
	static int array[] = new int[n];	//масив випадкових чисел
	public static void main(String[] args) {
		generator(true);	//генеруЇмо випадков≥ числа. якщо передаЇтьс€ true, то числа вс≥ в≥д'Їмн≥
		display();
		
		long time1 = System.currentTimeMillis();
		System.out.println("\nRecursive sum of positive elements: " + recursive(0));	//рекурсивний алгоритм
		System.out.println((double)(System.currentTimeMillis() - time1));
		
		long time2 = System.currentTimeMillis();
		//System.out.println("Iterative sum of positive elements: " + iterative());	//≥терац≥йний алгоритм
		System.out.println((double)(System.currentTimeMillis() - time2));
	}
	
	public static void generator(boolean flag) {
		Random random = new Random();
		if(flag) {
			for(int i = 0; i < n; i++) {
				array[i] = (random.nextInt(1000) * (-1));
			}
		} else {
			for(int i = 0; i < n; i++) {
				array[i] = (random.nextInt(1000) - 500);
			}
		}
	}
	public static void display() {
		System.out.print("Array: ");
		for(int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
	}
	public static int recursive(int i) {
		if(i == n || array[i] > 0) {
			return 0;
		}
		return array[i] + recursive(i + 1);
	}
	public static int iterative() {
		int sum = 0;
		for(int i = 0; i < n; i++) {
			if(array[i] > 0) {
				return sum;
			}
			sum += array[i];
		}
		return sum;
	}
	
}
