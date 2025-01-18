package com.example.demo;


import java.util.Date;

public class Review {

    private Long id;
    private String title;
    private String body;
    private Date publishedDate;
    private String author;
    private int rating;

    public Review(Long id, String title, String body, Date publishedDate, String author, int rating) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.publishedDate = publishedDate;
        this.author = author;
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "review{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", publishedDate=" + publishedDate +
                ", author='" + author + '\'' +
                ", rating=" + rating +
                '}';
    }
}
