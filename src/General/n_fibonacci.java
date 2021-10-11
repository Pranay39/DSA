package General;


// Find the nth fibonacci number

import java.util.Scanner;

public class n_fibonacci {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int n = input.nextInt();
		
//		System.out.println(a);
//		System.out.println(b);
//		
		int count = 2;
		
		while(count <= n) {
			int temp = b;
			
			b = a + b;
			a = temp;
			count++;
			
			
			
		}
		System.out.println(b);
		
		

	}

}
