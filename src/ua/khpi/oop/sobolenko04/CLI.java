package ua.khpi.oop.sobolenko04;
import java.util.Scanner;

public class CLI {
	
	/**
	 * An instance of scanner to input values
	 */
	Scanner scanner = new Scanner(System.in);
	
	/**
	 * Array of entered strings
	 */
	private String[] strings = new String[0];
	/**
	 * Total length of all strings
	 */
	private int totalStringLength = 0;
	/**
	 * Average length of all strings
	 */
	private int averageLength = 0;
	
	/**
	 * CLI of program
	 */
	public void run() {
		while (true) {
			System.out.println("Welcome to lab04");
			System.out.println("Use -h --help to see more info about program");
			System.out.println("Use -d --debug to run programm in debug mode");
			System.out.println("1 - set values");
			System.out.println("2 - see values");
			System.out.println("3 - run program");
			System.out.println("4 - exit");
			System.out.println("Enter number of action:");
			
			String action = scanner.nextLine();
			
			switch (action) {
			case "1":
				setValues();
				break;
			case "2":
				seeValues();
				break;
			case "3":
				splitIntoGroups();
				break;
			case "4":
				System.exit(0);
				break;
			case "-h":
			case "--help":
				showHelp();
				break;
			case "-d":
			case "--debug":
				runDebug();
				break;
			}
		}
	}
	
	/**
	 * Set values all variables
	 */
	private void setValues() {
		
		System.out.println("Enter number of strings: ");
		int stringNumber = Integer.parseInt(scanner.nextLine());
		
		strings = new String[stringNumber];
		
		System.out.println("Enter strings: ");
		for (int i = 0; i < strings.length; i++) {
			strings[i] = scanner.nextLine();
			
			totalStringLength += strings[i].length();
		}
		
		System.out.println("Press any button to back to menu: ");
		scanner.nextLine();
	}
	
	/**
	 * Print current values of all variables
	 */
	private void seeValues() {
		System.out.println("Strings: ");
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		System.out.println("Total string length: " + totalStringLength);
		System.out.println("Average string length: " + averageLength);
		
		System.out.println("Press any button to back to menu: ");
		scanner.nextLine();
	}
	
	/**
	 * Main logic of program from lab03
	 */
	private void splitIntoGroups() {
		averageLength = totalStringLength / strings.length;
		
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
		
		System.out.println("Press any button to back to menu: ");
		scanner.nextLine();
	}
	
	/**
	 * Show help for command line usage of program
	 */
	private void showHelp() {
		System.out.println("Author: Sergey Sobolenko KN-921v\n"
				+ "Task: 3. Ввести декілька рядків. Розбити на дві групи: рядки, довжина яких менша за середню; \n"
    			+ "рядки, довжина яких не менше середньої. Вивести рядки та їх довжину по групах.\n"
    			+ "1 - set values\r\n"
    			+ "2 - see values\r\n"
    			+ "3 - run program\r\n"
    			+ "4 - exit\r\n"
    			+ "Use -h --help to see more info about program\r\n"
    			+ "Use -d --debug to run programm in debug mode\r\n");
		
		System.out.println("Press any button to back to menu: ");
		scanner.nextLine();
	}

	/**
	 * Run program in debug mode
	 */
	private void runDebug() {
		setValues();
		splitIntoGroups();
		
		System.out.println("Press any button to back to menu: ");
		scanner.nextLine();
	}
}

