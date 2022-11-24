package ua.khpi.oop.sobolenko02;
import java.util.Random;

/**
 * Task: N = (18 - 1) % 10 + 1 = 8
 * 
 * 8.Знайти суму всіх парних і суму всіх непарних цифр в десятковому запису 8-значного цілого числа.
 * 
 * @author Sergey Sobolenko, KN-921v
 * @version 1.0
 *
 */
public class Main {

	/**
	 * An instance of class Random
	 */
	static Random random = new Random();
	
	/**
	 * Get the sum of odd digits of a number
	 * 
	 * @param number given number
	 * @return sum
	 */
	static int getOddDigitsSum(int number) {
		int sum = 0;
		
		for (; number != 0; number /= 10) {
			if ((number % 10) % 2 == 1) {
				sum += number % 10;
			}
		}
		
		return sum;
	}
	
	/**
	 * Get the sum of even digits of a number
	 * 
	 * @param number given number
	 * @return sum
	 */
	static int getEvenDigitsSum(int number) {
		int sum = 0;
		
		for (; number != 0; number /= 10) {
			if ((number % 10) % 2 == 0) {
				sum += number % 10;
			}
		}
		
		return sum;
	}
	
	/**
	 * Print table of numbers and their odd and even digits sum
	 * 
	 * @param tableLength how many examples generate
	 */
	static void printTable(int tableLength) {
		System.out.println("number   | odd sum | even sum |");
		System.out.println("------------------------------|");
		
		for (int i = 0; i < tableLength; i++) {
			int num = 10000000 + random.nextInt(90000000);
			
			System.out.println(num + " | " + getOddDigitsSum(num) + "\t   | " + getEvenDigitsSum(num) + "\t      |");
		}
		
		System.out.println("------------------------------|");
		
	}
	
	/**
	 * Entry point
	 * 
	 * @param args arguments from command line
	 */
	public static void main(String[] args) {
		printTable(10);
	}
}