package knightingale;

import java.util.Scanner;

public class FindAreaOfSquare {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the side of square :");
	double side= scanner.nextDouble();
	
	double area = side*side;
	System.out.println("The area of square is : "+ area);
}
}
