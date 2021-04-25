package com.challengeeldar.javabackend.challenge.model;

import java.time.LocalDate;

public abstract class CreditCard {
	
	protected String brand;
	
	protected int number;
	
	protected String cardHolder;
	
	protected LocalDate dueDate;
	
	public CreditCard(String brand, int number, String cardHolder,
			LocalDate dueDate, double consumption) {
		this.brand = brand;
		this.number = number;
		this.cardHolder = cardHolder;
		this.dueDate = dueDate;
	}


	public String getBrand() { return brand; }

	public void setBrand(String brand) { this.brand = brand; }

	public int getNumber() { return number; }

	public void setNumber(int number) {	this.number = number; }

	public LocalDate getDueDate() { return dueDate; }

	public void setDueDate(LocalDate dueDate) {	this.dueDate = dueDate; }
	
	public String getCardHolder() { return this.cardHolder; }
	
	public abstract double getRate(LocalDate currentDate);
}
