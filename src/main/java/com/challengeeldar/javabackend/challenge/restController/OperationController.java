package com.challengeeldar.javabackend.challenge.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challengeeldar.javabackend.challenge.dto.RateOfOperationDto;
import com.challengeeldar.javabackend.challenge.service.OperationService;

@RestController
@RequestMapping("/operation")
public class OperationController {

	@Autowired
	OperationService service;
		
	@GetMapping(value="/getRateOperation", produces = MediaType.APPLICATION_JSON_VALUE)
	public RateOfOperationDto getUserDTOById() throws Exception {
		return this.service.rateOfOperation();
	}
}
