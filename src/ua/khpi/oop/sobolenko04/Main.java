package ua.khpi.oop.sobolenko04;


/**
 * Task: Реалізація діалогового режиму роботи з користувачем в консольних програмах мовою Java.
 * 
 * @author Sergey Sobolenko, KN-921v
 * @version 1.0
 */

public class Main {
	
	/**
	 * Entry point
	 * @param args arguments from command line
	 */
	public static void main(String[] args) {
		CLI cli = new CLI();
		cli.run();
	}
}
