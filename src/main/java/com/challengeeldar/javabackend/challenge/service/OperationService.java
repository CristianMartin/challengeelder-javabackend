package com.challengeeldar.javabackend.challenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challengeeldar.javabackend.challenge.dto.RateOfOperationDto;
import com.challengeeldar.javabackend.challenge.model.Operation;
import com.challengeeldar.javabackend.challenge.repository.IOperationRepo;

@Service
public class OperationService {
	
	@Autowired
	IOperationRepo repoOp;
	
	public RateOfOperationDto rateOfOperation() {
		Operation operation = this.repoOp.getOne(1);
		return new RateOfOperationDto(operation.rate(), 
				operation.card().getBrand(), operation.consumption());
	}
}
