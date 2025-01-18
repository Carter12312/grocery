package com.example.demo;

import java.util.List;

public class GroceryItem {
    private String name;
    private String brand;
    private Long Id;
    private List<Review> reviews;
    private double avrgRating;

    public GroceryItem(String name, String brand, Long id, List<Review> reviews, double avrgRating) {
        this.name = name;
        this.brand = brand;
        Id = id;
        this.reviews = reviews;
        this.avrgRating = avrgRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public double getAvrgRating() {
        return avrgRating;
    }

    public void setAvrgRating(double avrgRating) {
        this.avrgRating = avrgRating;
    }

    @Override
    public String toString() {
        return "GroceryItem{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", Id=" + Id +
                ", reviews=" + reviews +
                ", avrgRating=" + avrgRating +
                '}';
    }

}
