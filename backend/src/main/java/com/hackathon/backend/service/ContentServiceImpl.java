package com.hackathon.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hackathon.backend.model.Content;
import com.hackathon.backend.repository.ContentRepository;

@Service
@Transactional
public class ContentServiceImpl implements ContentService {
    @Autowired
    private ContentRepository contentRepository;

    @Override
    public Content createContent(Content content) {
        List<Content> contents = this.contentRepository.findByClassroomID(content.getClassroomID());
        content.setOrder(contents.size() + 1);

        return contentRepository.save(content);
    }

    @Override
    public List<Content> getAllContentPerClassroom(String classroomID) {
        return this.contentRepository.findByClassroomID(classroomID);
    }
}
