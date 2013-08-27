class euler2 {
	public static void main(String args [] ) {
		int sum = 0;
		int num1 = 1;
		int num2 = 1;
		int current = 2;
		int which = 3;
		
		//Every third number of the Fib seq is odd when you start with two odd numbers
		
		while ( current < 4000000 ) {
			switch ( which ) {
			
			case 1:
				which++;
				break;
			case 2:
				which++;
				break;
			case 3:
				sum += current;
				which = 1;
				break;
			}
			
			num1 = num2;
			num2 = current;
			current = num1 + num2;
		}
		System.out.println(sum);
	}
}