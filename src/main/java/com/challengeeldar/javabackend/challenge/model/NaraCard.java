package com.challengeeldar.javabackend.challenge.model;

import java.time.LocalDate;

public class NaraCard extends CreditCard {

	public NaraCard(int number, String cardHolder, LocalDate dueDate, Double consumption) {
		super("Nara", number, cardHolder, dueDate, consumption);
	}

	@Override
	public double getRate(LocalDate currentDate) {
		double rate = currentDate.getDayOfMonth() * 0.5;
		if( rate < 0.3) {
			rate = 0.3;
		} else if(rate > 5.0){
			rate = 5.0;
		}
		return rate;
	}
}
