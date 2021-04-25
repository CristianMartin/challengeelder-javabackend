package com.challengeeldar.javabackend.challenge.model;

import java.time.LocalDate;

public class AmexCard extends CreditCard {

	public AmexCard(int number, String cardHolder, LocalDate dueDate, Double consumption) {
		super("Amex", number, cardHolder, dueDate, consumption);
	}

	@Override
	public double getRate(LocalDate currentDate) {
		double rate = currentDate.getMonthValue() * 0.1;
		if( rate < 0.3) {
			rate = 0.3;
		} else if(rate > 5.0){
			rate = 5.0;
		} 
		return rate;
	}
}
