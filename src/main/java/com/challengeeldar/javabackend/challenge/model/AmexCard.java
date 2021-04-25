package com.challengeeldar.javabackend.challenge.model;

import java.time.LocalDate;

public class AmexCard extends CreditCard {

	public AmexCard(String brand, int number, String name, String surname, LocalDate dueDate, Double consumption) {
		super(brand, number, name, surname, dueDate, consumption);
	}

	@Override
	public Double getRate(LocalDate currentDate) {
		return currentDate.getMonthValue() * 0.1;
	}
}
