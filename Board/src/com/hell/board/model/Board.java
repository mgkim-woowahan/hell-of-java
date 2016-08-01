package com.hell.board.model;

import java.util.Date;

/**
 * Created by mingook on 2016년7월 27일 (수).
 */
public class Board {
    private int index;
    private String title;
    private String content;
    private String author;

    public Board() {
    }

    public Board(int index, String title, String content, String author) {
        this.title = title;
        this.index = index;
        this.content = content;
        this.author = author;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
