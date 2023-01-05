package com.hackathon.backend.service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hackathon.backend.model.Classroom;
import com.hackathon.backend.repository.ClassroomRepository;

@Service
@Transactional
public class ClassroomServiceImpl implements ClassroomService {
    @Autowired
    private ClassroomRepository classroomRepository;

    @Override
    public String createClassroom(Classroom classroom) {
        classroom.setClassroomID(generateClassroomID());
        classroom.setLikes(0);
        classroom.setRating(0);
        classroom.setRatingCount(0);

        return classroomRepository.save(classroom).getClassroomID();
    }

    private String generateClassroomID() {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 57; // numeral '9'
        int targetStringLength = 6;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        Optional<Classroom> classroomDB = this.classroomRepository.findByClassroomID(generatedString);

        if (classroomDB.isPresent()) {
            generatedString = generateClassroomID();
        }

        return generatedString;
    }

    @Override
    public List<Classroom> getAllClassroom() {
        return this.classroomRepository.findAll();
    }
}
