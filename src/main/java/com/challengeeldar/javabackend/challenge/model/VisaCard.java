package com.challengeeldar.javabackend.challenge.model;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="visacard")
public class VisaCard extends CreditCard{
	
	public VisaCard() { }
	
	public VisaCard(int number, String cardHolder, LocalDate dueDate, Double consumption) {
		super("Visa", number, cardHolder, dueDate, consumption);
	}

	@Override
	public double getRate(LocalDate currentDate) {
		return currentDate.getYear() / currentDate.getMonthValue();
	}
}
