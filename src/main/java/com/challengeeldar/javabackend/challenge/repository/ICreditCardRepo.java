package com.challengeeldar.javabackend.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.challengeeldar.javabackend.challenge.model.CreditCard;

@Repository
public interface ICreditCardRepo extends JpaRepository<CreditCard, Integer> {}