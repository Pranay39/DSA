package practice_Dsa;

import java.util.Scanner;

public class Ocuurance {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		int count = 0;
		
		while(num1 > 0) {
			int rem = num1 % 10;
			if(rem == num2) {
				count += 1;
			}
			num1 = num1 / 10;
		}
		System.out.println(count);
		

	}

}
