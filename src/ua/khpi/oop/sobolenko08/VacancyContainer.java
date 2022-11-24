package ua.khpi.oop.sobolenko08;

import java.util.List;

public class VacancyContainer {
	private List<Vacancy> vacancies;
	
	public List<Vacancy> getVacancies() {
		return vacancies;
	}
	
	public void setVacancies(List<Vacancy> newVacancies) {
		vacancies = newVacancies;
	}
}
