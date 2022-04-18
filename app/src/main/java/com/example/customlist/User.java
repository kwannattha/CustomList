package com.example.customlist;

public class User {

    String name, lastMessage, lastMsgTime, major, university, quotation;
    int imageId;

    public User(String name, String lastMessage, String lastMsgTime, String major, String university,String quotation, int imageId) {
        this.name = name;
        this.lastMessage = lastMessage;
        this.lastMsgTime = lastMsgTime;
        this.major = major;
        this.university = university;
        this.quotation = quotation;
        this.imageId = imageId;
    }
}