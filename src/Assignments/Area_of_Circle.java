package Assignments;

import java.util.Scanner;

public class Area_of_Circle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter radius of circle= ");
		double radius = input.nextDouble();
		double area = Math.PI * radius * radius;
		System.out.println("Area= "+area);
		
		double perimeter = 2 * Math.PI * radius;  
		System.out.print("Perimeter= "+perimeter);
		

	}

}
