package com.example.demo.Review;


import com.example.demo.GroceryItem;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Review {

    private Long id;
    private String title;
    private String body;
    private LocalDateTime publishedDate;
    private String author;
    private int rating;
    @ManyToOne
    @JoinColumn(name = "grocery_item_id")
    private GroceryItem groceryItem;

    public Review(String title, String body, LocalDateTime publishedDate, String author, int rating, GroceryItem groceryItem) {
        this.title = title;
        this.body = body;
        this.publishedDate = publishedDate;
        this.author = author;
        this.rating = rating;
        this.groceryItem = groceryItem;
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

    public LocalDateTime getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDateTime publishedDate) {
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
