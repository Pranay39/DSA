package General;

import java.util.Scanner;

public class Occurance_check {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int count = 0;
		
		while(a>0) {
			int rem = a % 10;
			if(rem == b) {
				count += 1;
			}
			
			a = a / 10;
		}
		System.out.println(count);

	}

}
