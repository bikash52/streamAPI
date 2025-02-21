package streamAPI;

import java.util.Arrays;
import java.util.List;

public class PrimeNumber {
	public boolean isPrime(int number) {
		  if (number <= 1) {
		    return false;
		  }
		  for (int i = 2; i <= Math.sqrt(number); i++) {
		    if (number % i == 0) {
		        return false;
		    }
		  }
		  return true;
		}
		 
		private void printPrime() {
		  List<Integer> numbers = Arrays.asList(10, 11, 12, 13, 14, 15);
		  boolean containsPrime = numbers.stream()
		                                 .anyMatch(this::isPrime);
		  System.out.println("List contains a prime number: " + containsPrime);

		 }
}
