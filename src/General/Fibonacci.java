package General;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[]) {
		
//		Scanner input = new Scanner(System.in);
//		int a = input.nextInt();
//		int b = input.nextInt();
//		int n = input.nextInt();
		
		int a = 0;
		int b = 1;
		int n = 7;
		
		System.out.println(a);
		System.out.println(b);
		
		
		for(int i = 2; i<=n; i++) {
			int c = a+b;
			a = b;
			b = c;
			
			System.out.println(c);
			
		}
		
		
		
		
	}
	

}
