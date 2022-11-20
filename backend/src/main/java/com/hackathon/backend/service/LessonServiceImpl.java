package com.hackathon.backend.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hackathon.backend.model.Lesson;
import com.hackathon.backend.repository.LessonRepository;

@Service
@Transactional
public class LessonServiceImpl implements LessonService {
    @Autowired
    private LessonRepository lessonRepository;

    @Override
    public String createLesson(Lesson lesson) {
        lesson.setLessonID(generateDiscountCode());
        lesson.setLikes(0);
        lesson.setRating(0);
        lesson.setRatingCount(0);

        return lessonRepository.save(lesson).getLessonID();
    }

    private String generateDiscountCode() {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 57; // numeral '9'
        int targetStringLength = 6;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        Optional<Lesson> lessonDB = this.lessonRepository.findByLessonID(generatedString);

        if (lessonDB.isPresent()) {
            generatedString = generateDiscountCode();
        }

        return generatedString;
    }

    @Override
    public List<Lesson> getAllLesson() {
        return this.lessonRepository.findAll();
    }
}
