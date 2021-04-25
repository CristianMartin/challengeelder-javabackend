package com.challengeeldar.javabackend.challenge.model;

import java.time.LocalDate;

public class AmexCard extends CreditCard {

	public AmexCard(int number, String cardHolder, LocalDate dueDate, Double consumption) {
		super("Amex", number, cardHolder, dueDate, consumption);
	}

	@Override
	public double getRate(LocalDate currentDate) {
		return currentDate.getMonthValue() * 0.1;
	}
}
