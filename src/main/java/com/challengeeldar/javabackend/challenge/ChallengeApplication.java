package com.challengeeldar.javabackend.challenge;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.challengeeldar.javabackend.challenge.model.CreditCard;
import com.challengeeldar.javabackend.challenge.model.NaraCard;
import com.challengeeldar.javabackend.challenge.model.Operation;
import com.challengeeldar.javabackend.challenge.model.VisaCard;

@SpringBootApplication
public class ChallengeApplication implements CommandLineRunner {
	
	public CreditCard card1;
	
	public CreditCard card2;
	
	public Operation operation;
	
	public static void main(String[] args) {
		SpringApplication.run(ChallengeApplication.class, args);
	}
	
	@Override
	public void run(String... props) throws Exception {
		this.card1 = new VisaCard(123456789, "Cristian Aranguren", LocalDate.of(2022, 12, 22), 0.0);
		
		this.card2 = new NaraCard(123451234, "Cristian Aranguren", LocalDate.of(2022, 05, 12), 0.0);
			
		this.operation = Operation.builder().withCreditCard(card1).withConsumption(500).build();
		
//		System.out.println(this.infoCard(card1));
//		
//		System.out.println("\nEs una operacion valida?: " + this.isValidOperation(operation));
//		
//		System.out.println("\nEs una tarjeta valida para operar?: " + this.isValidCard(card2));
//		
//		System.out.println("\nEs una tarjeta valida para operar?: " + this.isValidCard(card1));
//		
//		System.out.println("\nSon tarjetas distintas?: " + this.areDifferentCards(card1, card2));
//		
//		System.out.println("\nSon tarjetas distintas?: " + this.areDifferentCards(card2, card2));
//		
//		System.out.println(this.rateOfOperation(operation));
	}
	
	public String infoCard(CreditCard card) {
		String infoCard = String.format(
				"\nBrand card: " + card.getBrand() + "\n\n" + 
				"Number card: " + card.getNumber() + "\n\n" +
				"CardHolder: " + card.getCardHolder() + "\n\n" +
				"Due date: " + card.getDueDate() + "\n\n"
				);
				
		return infoCard;
	}
	
	public boolean isValidOperation(Operation operation) {			
		return operation.consumption() < 1000;
	}
	
	public boolean isValidCard(CreditCard card) {
		return card.getDueDate().isAfter(LocalDate.now());
	}
	
	public String rateOfOperation(Operation operation) {
		return "\n\nLa tasa de operación es " + operation.rate() + "\n\n" +
			   "Marca: " + operation.card().getBrand() + "\n\n" + 
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
