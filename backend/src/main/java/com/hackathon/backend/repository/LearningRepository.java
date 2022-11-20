package com.hackathon.backend.repository;

import com.hackathon.backend.model.Learning;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

public interface LearningRepository extends MongoRepository<Learning, BigInteger> {
    List<Learning> findByLessonID(String lessonID);
}
