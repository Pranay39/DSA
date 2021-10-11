package Assignments;

import java.util.Scanner;

public class Simple_Interest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter principal amount= ");
		double p = input.nextDouble();
		
		System.out.print("Enter rate of interest= ");
		double r = input.nextDouble();
		
		System.out.print("Enter time period in years= ");
		double t = input.nextDouble();
		
		double interest = (p * r * t)/100;
		System.out.print("Simple interest= "+interest);
		

	}

}
