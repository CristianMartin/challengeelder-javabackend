package com.challengeeldar.javabackend.challenge.model;

import java.time.LocalDate;

public class VisaCard extends CreditCard{

	public VisaCard(String brand, int number, String name, String surname, LocalDate dueDate, Double consumption) {
		super(brand, number, name, surname, dueDate, consumption);
	}

	@Override
	public Double getRate(LocalDate currentDate) {
		return (double) (currentDate.getYear() / currentDate.getMonthValue());
	}
}
