package ua.khpi.oop.sobolenko03;

import java.util.Scanner;

/**
 * Task: N = (18 - 1) % 15 + 1 = 3
 * 
 * 3. Ввести декілька рядків. Розбити на дві групи: рядки, довжина яких менша за середню; 
 * рядки, довжина яких не менше середньої. Вивести рядки та їх довжину по групах.
 * 
 * @author Sergey Sobolenko, KN-921v
 *
 */

public class Main {
	
	/**
	 * Entry point
	 * 
	 * @param args arguments from command line
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of strings: ");
		int stringNumber = Integer.parseInt(scanner.nextLine());
		
		String[] strings = new String[stringNumber];
		
		int totalStringLength = 0;
		
		System.out.println("Enter strings: ");
		for (int i = 0; i < strings.length; i++) {
			strings[i] = scanner.nextLine();
			
			totalStringLength += strings[i].length();
		}
		
		int averageLength = totalStringLength / strings.length;
		
		System.out.println("Strings with length less than average:");
		for (int i = 0; i < strings.length; i++) {
			if (strings[i].length() < averageLength) {
				System.out.println(strings[i] + "\t" + strings[i].length());
			}
		}
		
		System.out.println("Strings with length greater than average:");
		for (int i = 0; i < strings.length; i++) {
			if (strings[i].length() >= averageLength) {
				System.out.println(strings[i] + "\t" + strings[i].length());
			}
		}
	}
}
