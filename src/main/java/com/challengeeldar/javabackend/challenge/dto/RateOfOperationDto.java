package com.challengeeldar.javabackend.challenge.dto;

public class RateOfOperationDto {
	private double rate;
	
	private String cardBrand;
	
	private double consumption;
	
	public RateOfOperationDto(double rate, String cardBrand, double consumption) {
		this.rate = rate;
		this.cardBrand = cardBrand;
		this.consumption = consumption;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public String getCardBrand() {
		return cardBrand;
	}

	public void setCardBrand(String cardBrand) {
		this.cardBrand = cardBrand;
	}

	public double getConsumption() {
		return consumption;
	}

	public void setConsumption(double consumption) {
		this.consumption = consumption;
	}
	
	
}
