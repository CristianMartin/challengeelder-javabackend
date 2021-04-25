package com.challengeeldar.javabackend.challenge.model;

import java.time.LocalDate;

public class NaraCard extends CreditCard {

	public NaraCard(String brand, int number, String name, String surname, LocalDate dueDate, Double consumption) {
		super(brand, number, name, surname, dueDate, consumption);
	}

	@Override
	public Double getRate(LocalDate currentDate) {
		return currentDate.getDayOfMonth() * 0.5;
	}
}
