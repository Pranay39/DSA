package Prime;

// Prime number with using function



public class prime_2 {

static void checkprime(int n)
{
	
	
	int flag=0;
	
	if(n==0 || n==1) {
		System.out.println("Not prime");
		
	}
	
	else {
		for(int i=2; i<n/2; i++) {
			if (n%i == 0) {
				System.out.println("Not prime");
				flag=1;
				break;
				}
			}
		
		if(flag==0) {
			System.out.println("Prime");
		}
		
	}
	
	
}



	public static void main(String[] args) {
		
//		checkprime(8);
//		checkprime(7);
//		checkprime(1);
//		checkprime(0);
//		checkprime(36);
//		checkprime(11);
		checkprime(4);
		
		
		

	}

}
