package com.challengeeldar.javabackend.challenge.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;

@Entity
@Inheritance
@DiscriminatorColumn(name="card_type", discriminatorType= DiscriminatorType.STRING)
public abstract class CreditCard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="card_id")
	private int id;
	@Column
	protected String brand;
	@Column
	protected int number;
	@Column
	protected String cardHolder;
	@Column
	protected LocalDate dueDate;
	
	public CreditCard() {}
	
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
