package com.challengeeldar.javabackend.challenge;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.challengeeldar.javabackend.challenge.model.AmexCard;
import com.challengeeldar.javabackend.challenge.model.CreditCard;
import com.challengeeldar.javabackend.challenge.model.NaraCard;
import com.challengeeldar.javabackend.challenge.model.Operation;
import com.challengeeldar.javabackend.challenge.model.VisaCard;

@SpringBootApplication
public class ChallengeApplication implements CommandLineRunner {
	
	CreditCard visaCard;
	
	CreditCard naraCard;
	
	CreditCard amexCard;
	
	CreditCard amexCard1;
	
	Operation operation;
	
	public static void main(String[] args) {
		SpringApplication.run(ChallengeApplication.class, args);
	}
	
	@Override
	public void run(String... props) {
		this.visaCard = new VisaCard(123456789, "Cristian Aranguren", LocalDate.of(2022, 12, 22), 0.0);
		
		this.naraCard = new NaraCard(123451234, "Cristian Aranguren", LocalDate.of(2022, 05, 12), 0.0);
		
		this.amexCard = new AmexCard(123456712, "Cristian Aranguren", LocalDate.of(2021, 03, 02), 0.0);
		
		this.amexCard1 = new AmexCard(123456712, "Cristian Aranguren", LocalDate.of(2021, 03, 04), 0.0);
		
		this.operation = new Operation();
		
		System.out.println(this.infoCard(visaCard));
		
		this.operation.setConsumption(500);
		System.out.println("Es una operacion valida?: " + this.isValidOperation(operation));
		
		System.out.println("Es una tarjeta valida para operar?: " + this.isValidCard(naraCard));
		
		System.out.println("Es una tarjeta valida para operar?: " + this.isValidCard(amexCard));
		
		System.out.println("Son tarjetas distintas?: " + this.areDifferentCards(amexCard, amexCard1));
		
		System.out.println("Son tarjetas distintas?: " + this.areDifferentCards(amexCard, amexCard));
		
		System.out.println(this.rateOfOperation(naraCard, operation));
	}
	
	public String infoCard(CreditCard card) {
		String infoCard = String.format(
				"\nBrand card: " + card.getBrand() + "\n\n" + 
				"Number card: " + card.getNumber() + "\n\n" +
				"CardHolder: " + card.getCardHolder() + "\n\n" +
				"Due date: " + card.getDueDate() + "\n\n" +
				"Consumption: " + card.getConsumption() + "\n\n"
				);
				
		return infoCard;
	}
	
	public boolean isValidOperation(Operation operation) {			
		return operation.consumption() < 1000;
	}
	
	public boolean isValidCard(CreditCard card) {
		return card.getDueDate().isAfter(LocalDate.now());
	}
	
	public String rateOfOperation(CreditCard card, Operation operation) {
		return "\nLa tasa de operación es " + card.getRate(LocalDate.now()) * operation.consumption() / 100 + "\n\n" +
			   "Marca: " + card.getBrand() + "\n\n" + 
			   "Importe: " + operation.consumption();
	}
	
	public boolean areDifferentCards(CreditCard card1, CreditCard card2) {
		return this.areDifferentBrandsOfCards(card1, card2) || this.areDifferentNumbersOfCards(card1, card2) 
				|| this.areDifferentCardHolderOfCards(card1, card2) || this.areDifferentDueDateOfCards(card1, card2);
	}
	
	public boolean areDifferentBrandsOfCards(CreditCard card1, CreditCard card2) {
		return !(card1.getBrand().equals(card2.getBrand()));
	}
	
	public boolean areDifferentNumbersOfCards(CreditCard card1, CreditCard card2) {
		return (card1.getNumber() != card2.getNumber());
	}
	
	public boolean areDifferentCardHolderOfCards(CreditCard card1, CreditCard card2) {
		return !(card1.getCardHolder().equals(card2.getCardHolder()));
	}
	
	public boolean areDifferentDueDateOfCards(CreditCard card1, CreditCard card2) {
		return !(card1.getDueDate().isEqual(card2.getDueDate()));
	}
}
