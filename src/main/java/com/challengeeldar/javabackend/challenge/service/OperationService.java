package com.challengeeldar.javabackend.challenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challengeeldar.javabackend.challenge.ChallengeApplication;
import com.challengeeldar.javabackend.challenge.dto.RateOfOperationDto;

@Service
public class OperationService {
	
	@Autowired
	ChallengeApplication application;

	public RateOfOperationDto rateOfOperation() {
		return new RateOfOperationDto(this.application.operation.rate(), 
				this.application.card1.getBrand(), this.application.operation.consumption());
	}
}
