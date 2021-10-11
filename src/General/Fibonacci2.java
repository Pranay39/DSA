package General;

import java.util.Scanner;

public class Fibonacci2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int n = input.nextInt();
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i = 0; i <=n; i++) {
			int c = a+b;
			a = b;
			b = c;
			System.out.println(c);
		}

	}

}
