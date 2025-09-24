package lab_01;
import java.util.*;

class Ch3 {
	public static void printArray(double arr[][]) {  
		System.out.println("The number of rows in arr array: " + arr.length);
		for(int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] ");
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}	

	public static double[][] run1(Scanner s) { 
		System.out.print("Enter the number of rows of real non-square array to create:");
		int amount = s.nextInt();
		double arr[][] = new double[amount][];
		for(int i = 0; i < amount; i++) {
			arr[i] = new double[i + 1];
			System.out.print("Enter " + (i+1) + " numbers in a row to store in row " + (i+1) + ": ");		
			for(int j = 0; j <= i; j++) {
				arr[i][j] = s.nextDouble();
			}
		}
		return arr;
	}
	
	public static double[][] run2(Scanner s) { 
		int amount = 0;
		while(true) {
			try { 
				System.out.print("Enter the number of rows of real non-square array to create:");
				amount = s.nextInt();
				if (amount < 0) {
					throw new NegativeArraySizeException();
				}
				break;
			}
			catch(InputMismatchException e) {
				s.nextLine();
				System.out.println("You must enter an integer. Try again.");
			}
			catch(NegativeArraySizeException e) {
				System.out.println("You must enter a POSITIVE  integer. Try again.");
			}
		}
		double arr[][] = new double[amount][];
		for(int i = 0; i < amount; i++) {
			arr[i] = new double[i + 1];
			while(true) {
				try { 
					System.out.print("Enter " + (i+1) + " numbers in a row to store in row " + (i+1) + ": ");		
					for(int j = 0; j <= i; j++) {
						arr[i][j] = s.nextDouble();
					}
					break;
				}
				catch(InputMismatchException e) {
					s.nextLine();
					System.out.println("You must enter an INTEGER or DOUBLE value. Try again.");
				}
			}
		}
		return arr;
	}
 }

public class Ch3_HomeWork {

	public static void main(String[] args) {
		double array[][] = { {0}, {1,2}, {3,4,5} };
        Ch3.printArray(array);
 
		System.out.println();

        Scanner scanner = new Scanner(System.in);
        double dArr1[][] = Ch3.run1(scanner);
        Ch3.printArray(dArr1);
        System.out.println();
        
        double dArr2[][] = Ch3.run2(scanner);
        Ch3.printArray(dArr2);
        System.out.println();
        
        scanner.close();
        System.out.println("Done.");
	}

}
