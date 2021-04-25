package com.challengeeldar.javabackend.challenge.model;

import java.time.LocalDate;

public class VisaCard extends CreditCard{

	public VisaCard(int number, String cardHolder, LocalDate dueDate, Double consumption) {
		super("Visa", number, cardHolder, dueDate, consumption);
	}

	@Override
	public double getRate(LocalDate currentDate) {
		double rate = currentDate.getYear() / currentDate.getMonthValue();
		if( rate < 0.3) {
			rate = 0.3;
		} else if(rate > 5.0){
			rate = 5.0;
		} 
		return rate;		
	}
}
