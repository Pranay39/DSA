package conditional_Statements;

import java.util.Scanner;

public class Alphabet_Case {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		char c = input.next().trim().charAt(0);
		
		
		if(c >= 'a' && c <= 'z') {
			System.out.println("Lower Case");
			
		}
		else {
			System.out.println("Upper Case");
		}

	}

}
