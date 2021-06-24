package com.example.learning.Model;

public class User {

    String uid;
    String username;
    String phone;
    String about;



    String email;
    String img;

    public User()
    {
    }

    public User(String uid, String username, String phone, String about, String email, String img) {
        this.uid = uid;
        this.username = username;
        this.phone = phone;
        this.about = about;
        this.email = email;
        this.img = img;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
