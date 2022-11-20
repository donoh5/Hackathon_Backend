package com.hackathon.backend.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hackathon.backend.model.Quiz;
import com.hackathon.backend.repository.QuizRepository;

@Service
@Transactional
public class QuizServiceImpl implements QuizService {
    @Autowired
    private QuizRepository quizRepository;

    @Override
    public Quiz createQuiz(Quiz quiz) {
        List<Quiz> quizzes = this.quizRepository.findByLessonID(quiz.getLessonID());
        quiz.setOrder(quizzes.size() + 1);

        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> getAllQuizPerLesson(String lessonID) {
        return this.quizRepository.findByLessonID(lessonID);
    }
}
