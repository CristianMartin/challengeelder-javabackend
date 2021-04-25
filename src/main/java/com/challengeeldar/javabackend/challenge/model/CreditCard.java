package com.challengeeldar.javabackend.challenge.model;

import java.time.LocalDate;

public abstract class CreditCard {
	
	private String brand;
	
	private int number;
	
	private String name;
	
	private String surname;
	
	private LocalDate dueDate;
	
	private Double consumption;
	
	
	public CreditCard(String brand, int number, String name, String surname,
			LocalDate dueDate, Double consumption) {
		this.brand = brand;
		this.number = number;
		this.name = name;
		this.surname = surname;
		this.dueDate = dueDate;
		this.consumption = consumption;
	}


	public String getBrand() { return brand; }

	public void setBrand(String brand) { this.brand = brand; }

	public int getNumber() { return number; }

	public void setNumber(int number) {	this.number = number; }

	public String getName() { return name; }

	public void setName(String name) { this.name = name; }

	public String getSurname() { return surname; }

	public void setSurname(String surname) { this.surname = surname; }

	public LocalDate getDueDate() { return dueDate; }

	public void setDueDate(LocalDate dueDate) {	this.dueDate = dueDate; }

	public Double getConsumption() { return consumption; }

	public void setConsumption(Double consumption) { this.consumption = consumption; }
	
	public String getCardHolder() { return this.name + "" + this.surname; }
	
	public abstract Double getRate(LocalDate currentDate);

}
