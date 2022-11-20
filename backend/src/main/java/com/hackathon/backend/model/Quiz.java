package com.hackathon.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.math.BigInteger;

@Document(collection = "quiz")
public class Quiz {
    @Id
    private BigInteger id;
    private String lessonID;
    private int order;
    private String question;
    private byte[] pic1;
    private byte[] pic2;
    private byte[] pic3;
    private byte[] pic4;
    private String desc1;
    private String desc2;
    private String desc3;
    private String desc4;
    private int answer;

    public Quiz(String lessonID, String question, byte[] pic1, byte[] pic2, byte[] pic3, byte[] pic4, String desc1, String desc2, String desc3, String desc4, int answer) {
        this.lessonID = lessonID;
        this.question = question;
        this.pic1 = pic1;
        this.pic2 = pic2;
        this.pic3 = pic3;
        this.pic4 = pic4;
        this.desc1 = desc1;
        this.desc2 = desc2;
        this.desc3 = desc3;
        this.desc4 = desc4;
        this.answer = answer;
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

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public byte[] getPic1() {
        return pic1;
    }

    public void setPic1(byte[] pic1) {
        this.pic1 = pic1;
    }

    public byte[] getPic2() {
        return pic2;
    }

    public void setPic2(byte[] pic2) {
        this.pic2 = pic2;
    }

    public byte[] getPic3() {
        return pic3;
    }

    public void setPic3(byte[] pic3) {
        this.pic3 = pic3;
    }

    public byte[] getPic4() {
        return pic4;
    }

    public void setPic4(byte[] pic4) {
        this.pic4 = pic4;
    }

    public String getDesc1() {
        return desc1;
    }

    public void setDesc1(String desc1) {
        this.desc1 = desc1;
    }

    public String getDesc2() {
        return desc2;
    }

    public void setDesc2(String desc2) {
        this.desc2 = desc2;
    }

    public String getDesc3() {
        return desc3;
    }

    public void setDesc3(String desc3) {
        this.desc3 = desc3;
    }

    public String getDesc4() {
        return desc4;
    }

    public void setDesc4(String desc4) {
        this.desc4 = desc4;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}
