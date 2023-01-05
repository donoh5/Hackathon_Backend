package com.hackathon.backend.service;

import java.util.List;

import com.hackathon.backend.model.Content;

public interface ContentService {
    Content createContent(Content content);

    List<Content> getAllContentPerClassroom(String classroomID);
}
