package com.example.calendar;

public class Noidung {

    String title;
    String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public Noidung(String title, String content){
        this.title = title;
        this.content = content;
    }
    public Noidung(){
        this.title = null;
        this.content = null;
    }
}
