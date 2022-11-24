package ua.khpi.oop.sobolenko01;

/**
 * Task: Обрати тип змінних та встановити за допомогою констант та літералів початкові значення.
 * Використовуючи десятковий запис цілочисельного значення кожної змінної знайти і підрахувати кількість парних і непарних цифр.
 * Використовуючи двійковий запис цілочисельного значення кожної змінної підрахувати кількість одиниць.
 * 
 * @author Sergey Sobolenko, KN-921v
 * 
 * @version 1.0
 *
 */
public class Main {
	
	/** 
	 * Number in group list 
	 */
	private static int number = 0x12;
	/** 
	 * Phone number
	 */
	private static long phoneNumber = 380505881234L;
	/** 
	 * Last 2 digits of number
	 */
	private static int last2DigitsOfNumber = 0b100010;
	/** 
	 * Last 4 digits of number
	 */
	private static int last4DigitsOfNumber = 2322;
	/** 
	 * Incremented by 1 modulo 26 decremented by 1 number in the group list
	 */
	private static int modulo26 = ((number - 1) % 26) + 1;
	/** 
	 * Upper char value of modulo26
	 */
	private static char letter = (char)(modulo26 + 'A' - 1);
	
	/** 
	 * Count all odd digits in number
	 * 
	 * @param given number 
	 * @return odd digits count
	 */
	private static int countOddDigits(long number) {
	  int oddCount = 0;
	    
	  for (; number != 0; number /= 10) {
	    if ((number % 10) % 2 == 1) {
	    	oddCount++;
	    }
	  }
	  
	  return oddCount;
	}
  
	/** 
	 * Count all 1 in binary representation of number
	 * 
	 * @param given number
	 * @return 1 count
	 */
	private static int countOnes(long number) {
		int onesCount = 0;
		
		for (; number != 0; number /= 2) {
			if (number % 2 == 1) {
				onesCount++;
			}
		}
		
		return onesCount;
	}
	
	/**
	 * Entry point
	 * 
	 * @param args arguments from command line
	 */
	public static void main(String[] args) {
		
		System.out.println("Task 1: count odd digits in numbers");
		System.out.println(countOddDigits(number));
		System.out.println(countOddDigits(phoneNumber));
		System.out.println(countOddDigits(last2DigitsOfNumber));
		System.out.println(countOddDigits(last4DigitsOfNumber));
		System.out.println(countOddDigits(modulo26));
		
		System.out.println("Task 2: count all 1 in numbers");
		System.out.println(countOnes(number));
		System.out.println(countOnes(phoneNumber));
		System.out.println(countOnes(last2DigitsOfNumber));
		System.out.println(countOnes(last4DigitsOfNumber));
		System.out.println(countOnes(modulo26));
	}
}