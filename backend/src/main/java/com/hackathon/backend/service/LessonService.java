package com.hackathon.backend.service;

import java.math.BigInteger;
import java.util.List;

import com.hackathon.backend.model.Lesson;

public interface LessonService {
    String createLesson(Lesson lesson);

    List<Lesson> getAllLesson();
}
