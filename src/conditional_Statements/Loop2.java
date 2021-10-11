package conditional_Statements;

import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int i = 1;
		while(i <= n) {
			System.out.print(i+" ");
			i++;
		}

	}

}
