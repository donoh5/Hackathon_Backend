package com.hackathon.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.hackathon.backend.model.Content;
import com.hackathon.backend.service.ContentService;

@RestController
public class ContentController {
    @Autowired
    ContentService contentService;

    @PostMapping("/content")
    public ResponseEntity<List<Content>> getAllContentByClassroom(@RequestParam String classroomID) {
        return ResponseEntity.ok().body(contentService.getAllContentPerClassroom(classroomID));
    }

    @PostMapping("/createContent")
    public ResponseEntity<Content> createContent(@RequestBody Content content) {
        return ResponseEntity.ok().body(contentService.createContent(content));
    }

}
