package com.hackathon.backend.repository;

import com.hackathon.backend.model.Quiz;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

public interface QuizRepository extends MongoRepository<Quiz, BigInteger> {
    List<Quiz> findByClassroomID(String classroomID);
}
