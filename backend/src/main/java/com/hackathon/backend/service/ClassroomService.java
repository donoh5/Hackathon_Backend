package com.hackathon.backend.service;

import java.util.List;

import com.hackathon.backend.model.Classroom;

public interface ClassroomService {
    String createClassroom(Classroom classroom);

    List<Classroom> getAllClassroom();
}
