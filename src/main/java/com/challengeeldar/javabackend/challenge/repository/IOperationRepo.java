package com.challengeeldar.javabackend.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.challengeeldar.javabackend.challenge.model.Operation;

@Repository
public interface IOperationRepo extends JpaRepository<Operation, Integer> {}

