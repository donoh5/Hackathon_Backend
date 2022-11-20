package com.hackathon.backend.service;

import java.math.BigInteger;
import java.util.List;

import com.hackathon.backend.model.Learning;

public interface LearningService {
    Learning createLearning(Learning lesson);

    List<Learning> getAllLearningPerLesson(String lessonID);
}
