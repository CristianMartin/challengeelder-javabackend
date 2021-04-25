package com.challengeeldar.javabackend.challenge.model;

import java.time.LocalDate;

public class Operation {
	
	private double consumption;
	
	private CreditCard card;
	
	private LocalDate date;
	
	private Operation(Builder builder) {
		this.date = builder.date;
		this.card = builder.card;
		this.consumption = builder.consumption;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public void setConsumption(double consumption) { this.consumption = consumption; }
	
	public Double consumption() { return this.consumption; }
	
	public CreditCard card() { return card; }
	
	public double rate() {
		double cardRate = card.getRate(this.date);
		double minRate = this.minRateValue();
		double maxRate = this.maxRateValue();
		
		if( cardRate < minRate) {
			return minRate;
		} 
		if(cardRate > maxRate) {
			return maxRate;
		}
		return cardRate;
	}
	
	private double maxRateValue() {
		return this.consumption() * 5 / 100;
	}
	
	private double minRateValue() {
		return this.consumption() * 0.3 / 100;
	}
	
	public static class Builder {
		private double consumption;
		
		private CreditCard card;
		
		private LocalDate date;
		
		public Builder() {
			this.date = LocalDate.now();
		}
		
		public Builder withCreditCard(CreditCard card) throws Exception  {
			if(card.getDueDate().isBefore(date)) {
				throw new Exception("expired card");
			}
			this.card = card;
			return this;
		}
		
		public Builder withConsumption(double consumption) throws Exception {
			if(consumption > 1000) {
				throw new Exception("minimum consumption exceeded");
			}
			this.consumption = consumption;
			return this;
		}
		
		public Operation build() {
			return new Operation(this);
		}
	}
}
