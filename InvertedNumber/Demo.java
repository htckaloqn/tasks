package InvertedNumber;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
		
	int number = 0;
		
	do {
			
		System.out.print("Number = ");
		number = scanner.nextInt();
	} while (number <= 9);

	int iNumber = 0;
		
	while( number != 0 ) {
		
		iNumber = iNumber * 10;
		iNumber = iNumber + number % 10;
		   number = number / 10;
		    
	}

	System.out.println("Inverted Number = " + iNumber);
	
	scanner.close();
	}
}
