package Assignments;

import java.util.Scanner;

public class dollar_inr {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter amount in INR= ");
		double amt = input.nextDouble();
		
		double ans = amt / 75.13;
		
		double roundOff_ans = Math.round(ans * 100.0)/100.0;  // It will round of the answer by two digits
		
		System.out.println("Dollarr= "+roundOff_ans);
		

	}

}
