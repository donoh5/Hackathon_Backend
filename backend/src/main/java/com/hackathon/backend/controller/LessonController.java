package com.hackathon.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.hackathon.backend.model.Lesson;
import com.hackathon.backend.service.LessonService;

@RestController
public class LessonController {
    @Autowired
    LessonService lessonService;

    @GetMapping("/lessons")
    public ResponseEntity<List<Lesson>> getAllLesson() {
        return ResponseEntity.ok().body(lessonService.getAllLesson());
    }

    @PostMapping("/createLesson")
    public ResponseEntity<String> createLesson(@RequestBody Lesson lesson) {
        return ResponseEntity.ok().body(lessonService.createLesson(lesson));
    }

}
