package com.example.learning.Model;

public class Instructor_Model {
    int img;
    String name,subject;

    public Instructor_Model(int img, String name, String subject) {
        this.img = img;
        this.name = name;
        this.subject = subject;
    }

    public Instructor_Model() {
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
