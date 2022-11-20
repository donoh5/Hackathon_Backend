package com.hackathon.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hackathon.backend.model.Lesson;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

public interface LessonRepository extends MongoRepository<Lesson, BigInteger> {
    Optional<Lesson> findByLessonID(String lessonID);
}
