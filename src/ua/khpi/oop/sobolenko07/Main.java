package ua.khpi.oop.sobolenko07;

import java.util.ArrayList;

/**
 * Task: N = (18 - 1) % 16 + 1 = 2
 * 2. Дані про вакансії: посада (вид діяльності); 
 * компанія (назва комерційної організації або фірми, якщо є);
 * умови праці; 
 * оплата; 
 * вимоги до фахівця - набір необов'язкових властивостей у вигляді "спеціальність, стаж, освіта".
 * 
 * @author serga
 * @version 1.0
 */

public class Main {
	/**
	 * Entry point
	 * 
	 * @param args arguments from command line
	 */
	public static void main(String[] args) {
		Vacancy vacancy = new Vacancy();
		
		vacancy.setJobTitle("BackEnd Middle Developer");
		vacancy.setCompanyName("N2X Solutions");
		vacancy.setWorkingConditions("Полный рабочий день, график 5/2, в офиссе");
		vacancy.setSalary(3500.25);
		ArrayList<String> reqs = new ArrayList<String>();
		reqs.add("Bachelor IT graduation");
		reqs.add("English level B2");
		vacancy.setRequirements(reqs);
		
		System.out.println(vacancy);
		
	}
}
