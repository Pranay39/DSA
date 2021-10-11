package conditional_Statements;

import java.util.Scanner;

public class Largest_No {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
      // Approach 1
		
//		int max = a;
//		
//		if(b > max) {
//			max = b;
//		}
//		
//		if(c > max) {
//			max = c;
//		}
//		
//		System.out.println(max);
		
		
      // Approach 2
//		int max = 0;
//		if(a > b) {
//			max = a;
//			
//		}
//		else {
//			max = b;
//		}
//		if(c > max) {
//			max = c;
//		}
//		System.out.println(max);
		
		// Approach 3
		
		System.out.println(Math.max(Math.max(a, b), c));

	}

}
