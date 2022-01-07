package Assignments;

import java.util.Scanner;

public class Area_Of_Triangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
     // Area of triangle where base & height is given
//		System.out.print("Enter base= ");
//		double base = input.nextDouble();
//		
//		System.out.print("Enter height= ");
//		double height = input.nextDouble();
//		
//		double area = (base * height) / 2;   // When base & height are given
//		System.out.println("Area= "+area);
		
		
		
		
//		
		
		/* Area of isosceles triangle where side and base is given
		  ( where two sides are equal & angles opposite to the sides are also equal)
		 
		*/
		
//		double side_A = input.nextDouble();
//		double base2 = input.nextDouble();
//		double area_i = ( base2 * (Math.sqrt((4 * side_A * side_A) - base2 * base2)) )/ 4;
//		System.out.println("Area of Isosceles Triangle= "+area_i);
		
		
		
		
		
		// Area of Equilateral Triangle ( All sides are equal )  --> (root(3) / 4) * a * a
		
		double side_a = input.nextDouble();
		double area_equi_tri = (Math.sqrt(3) / 4) * side_a * side_a;
		System.out.println(area_equi_tri);
		

	}

}
