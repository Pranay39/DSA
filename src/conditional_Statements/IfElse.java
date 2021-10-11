package conditional_Statements;

public class IfElse {

	public static void main(String[] args) {
		int salary = 25000;
		
		if(salary<=10000) {
			salary += 1000;
			System.out.println("Salary= "+salary);
		}
		else if(salary<=20000) {
			salary += 2000;
			System.out.println("Salary= "+salary);
			
		}
		else {
			salary += 3000;
			System.out.println("Salary= "+salary);
		}
		
		

	}

}
