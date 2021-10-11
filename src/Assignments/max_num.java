package Assignments;

import java.util.Scanner;

public class max_num {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c  = input.nextInt();
		
		int max = a;
		
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		System.out.println("Maximun Number= "+max);
		
		System.out.println(Math.max(111, Math.max(112, 113)));
		
		
		

	}

}
