package com.hackathon.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.hackathon.backend.model.Classroom;
import com.hackathon.backend.service.ClassroomService;

@RestController
public class ClassroomController {
    @Autowired
    ClassroomService classroomService;

    @GetMapping("/classroom")
    public ResponseEntity<List<Classroom>> getAllClassroom() {
        return ResponseEntity.ok().body(classroomService.getAllClassroom());
    }

    @PostMapping("/createClassroom")
    public ResponseEntity<String> createClassroom(@RequestBody Classroom classroom) {
        return ResponseEntity.ok().body(classroomService.createClassroom(classroom));
    }

}
