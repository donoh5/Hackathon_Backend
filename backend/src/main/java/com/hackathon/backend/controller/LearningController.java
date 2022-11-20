package com.hackathon.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.hackathon.backend.model.Learning;
import com.hackathon.backend.service.LearningService;

@RestController
public class LearningController {
    @Autowired
    LearningService learningService;

    @PostMapping("/learning")
    public ResponseEntity<List<Learning>> getAllLearningByLesson(@RequestParam String lessonID) {
        return ResponseEntity.ok().body(learningService.getAllLearningPerLesson(lessonID));
    }

    @PostMapping("/createLearning")
    public ResponseEntity<Learning> createLearning(@RequestBody Learning learning) {
        return ResponseEntity.ok().body(learningService.createLearning(learning));
    }

}
