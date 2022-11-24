package ua.khpi.oop.sobolenko08;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Task: create container for objects from previous lab implement 
 * 
 * @author Sergey Sobolenko, KN-921v
 * @version 1.0
 */

public class Main {
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
		
		Vacancy vacancy2 = new Vacancy();
		vacancy2.setJobTitle("Junior DevOps");
		vacancy2.setCompanyName("Local Logic");
		vacancy2.setWorkingConditions("Полный рабочий день, график 5/2, удаленно");
		vacancy2.setSalary(700.50);
		reqs = new ArrayList<String>();
		reqs.add("Linux essentials sertificate");
		reqs.add("English level B1");
		vacancy2.setRequirements(reqs);
		
		VacancyContainer vacancyContainer = new VacancyContainer();
		List<Vacancy> vacancies = new ArrayList<>();
		vacancies.add(vacancy);
		vacancies.add(vacancy2);
		vacancyContainer.setVacancies(vacancies);
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Set the path: ");
		String path = scanner.nextLine();
		
        try {
			XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(path + ".xml")));
			x.writeObject(full);
			x.close();
			System.out.println("Done");
        } 
        catch (FileNotFoundException e) {
		
			e.printStackTrace();
			System.out.println("Error");
		}
		
	}
}
