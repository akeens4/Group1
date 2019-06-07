package chapter4.exercise416;
import java.util.Scanner;
public class SquareTest {
	
	// Driver code for above function 
	public static void main(String args[]) { 
		Scanner input = new Scanner(System.in);
		Square obj = new Square();
		
		System.out.print("Enter squre size(in digits): ");
		int squareSize = input.nextInt();
		obj.print_square(squareSize);
	} 
}
