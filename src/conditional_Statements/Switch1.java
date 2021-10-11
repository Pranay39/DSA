package conditional_Statements;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String fruit = input.next();
		switch(fruit) {
		
		case "mango":
			System.out.println("Sweet fruit");
			break;
			
		case "apple":
			System.out.println("Red fruit");
			break;
			
		case "orange":
			System.out.println("Round fruit");
			break;
			
		default:
			System.out.println("Invalid fruit");
		}
		
		

	}

}
