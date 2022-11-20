package com.hackathon.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.math.BigInteger;

@Document(collection = "lesson")
public class Lesson {
    @Id
    private BigInteger id;
    private String lessonID;
    private String title;
    private String category;
    private int likes;
    private double rating;
    private int ratingCount;

    public Lesson(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getLessonID() {
        return lessonID;
    }

    public void setLessonID(String lessonID) {
        this.lessonID = lessonID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getRatingCount() { return ratingCount; }

    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
    }
}
