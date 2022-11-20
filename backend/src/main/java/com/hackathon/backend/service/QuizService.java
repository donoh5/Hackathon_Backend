package com.hackathon.backend.service;

import java.math.BigInteger;
import java.util.List;

import com.hackathon.backend.model.Quiz;

public interface QuizService {
    Quiz createQuiz(Quiz quiz);

    List<Quiz> getAllQuizPerLesson(String lessonID);
}
