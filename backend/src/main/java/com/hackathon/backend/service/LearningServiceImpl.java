package com.hackathon.backend.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hackathon.backend.model.Learning;
import com.hackathon.backend.repository.LearningRepository;

@Service
@Transactional
public class LearningServiceImpl implements LearningService {
    @Autowired
    private LearningRepository learningRepository;

    @Override
    public Learning createLearning(Learning learning) {
        List<Learning> learnings = this.learningRepository.findByLessonID(learning.getLessonID());
        learning.setOrder(learnings.size() + 1);

        return learningRepository.save(learning);
    }

    @Override
    public List<Learning> getAllLearningPerLesson(String lessonID) {
        return this.learningRepository.findByLessonID(lessonID);
    }
}
