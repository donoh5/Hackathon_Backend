package com.hackathon.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.hackathon.backend.model.Quiz;
import com.hackathon.backend.service.QuizService;

@RestController
public class QuizController {
    @Autowired
    QuizService quizService;

    @PostMapping("/quiz")
    public ResponseEntity<List<Quiz>> getAllQuizPerLesson(@RequestParam String lessonID) {
        return ResponseEntity.ok().body(quizService.getAllQuizPerLesson(lessonID));
    }

    @PostMapping("/createQuiz")
    public ResponseEntity<Quiz> createLearning(@RequestBody Quiz quiz) {
        return ResponseEntity.ok().body(quizService.createQuiz(quiz));
    }

}
