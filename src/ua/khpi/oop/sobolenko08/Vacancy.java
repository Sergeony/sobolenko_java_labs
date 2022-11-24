package ua.khpi.oop.sobolenko08;

import java.util.ArrayList;
import java.util.List;

public class Vacancy {
	private String jobTitle = null;
	private String companyName = null;
	private String workingConditions = null;
	private double salary = 0;
	private ArrayList<String> requirements;
	
	/**
	 * GETTERS
	 * 
	 */
	public String getJobTitle() {
		return jobTitle;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public String getWorkingConditions() {
		return workingConditions;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public List getRequirements() {
		return requirements;
	}
	
	/*
	 * SETTERS 
	 * 
	 */
	public void setJobTitle(String newJobTitle) {
		jobTitle = newJobTitle;
	}
	
	public void setCompanyName(String newCompanyName) {
		companyName = newCompanyName;
	}
	
	public void setWorkingConditions(String newWorkingConditions) {
		workingConditions = newWorkingConditions;
	}
	
	public void setSalary(double newSalary) {
		salary = newSalary;
	}
	
	public void setRequirements(ArrayList<String> newRequirements) {
		requirements = newRequirements;
	}
	
	@Override
	public String toString() {
		return "Job title: " + jobTitle 
				+ "\nCompany name: " + companyName 
				+ "\nWorking conditions: " + workingConditions 
				+ "\nSalary: " + salary 
				+ "\nRequirements: " + requirements;
	}
}
