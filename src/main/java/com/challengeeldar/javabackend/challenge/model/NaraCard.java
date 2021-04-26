package com.challengeeldar.javabackend.challenge.model;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;	

@Entity
@DiscriminatorValue(value="naracard")
public class NaraCard extends CreditCard {
	
	public NaraCard() { }

	public NaraCard(int number, String cardHolder, LocalDate dueDate, Double consumption) {
		super("Nara", number, cardHolder, dueDate, consumption);
	}

	@Override
	public double getRate(LocalDate currentDate) {
		return currentDate.getDayOfMonth() * 0.5;
	}
}
