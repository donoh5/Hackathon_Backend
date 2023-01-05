package com.hackathon.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hackathon.backend.model.Classroom;

import java.math.BigInteger;
import java.util.Optional;

public interface ClassroomRepository extends MongoRepository<Classroom, BigInteger> {
    Optional<Classroom> findByClassroomID(String classroomID);
}
