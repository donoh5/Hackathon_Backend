package com.hackathon.backend.repository;

import com.hackathon.backend.model.Content;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.math.BigInteger;
import java.util.List;

public interface ContentRepository extends MongoRepository<Content, BigInteger> {
    List<Content> findByClassroomID(String classroomID);
}
