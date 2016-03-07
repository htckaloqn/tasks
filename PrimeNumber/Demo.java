package PrimeNumber;

import java.util.Scanner;

public class Demo {
	
public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in);
		
		int number = 0;
		
		do {
		
			System.out.print("Number = ");
			number = scanner.nextInt();
		} while (number <= 1);
		
		
		 int a = 0;
		 boolean isPrime = false;

		 for (int i = 1; i <=  number; ++i) {
		   
			 if (number % i == 0 ) {
		     
				 a += 1;
			 }
		 }
		
		 if (a == 2 ) {
		  
			 isPrime = true;
		 }

		 System.out.println("Prime : " + isPrime);
		 
		 scanner.close();
	}
}
