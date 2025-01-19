package com.example.demo.Review;

import com.example.demo.GroceryItem;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1/review")
public class ReviewController {
    @GetMapping("getOne/{reviewId}")
    Review singleReview(@PathVariable Long reviewId){
        return new Review("test", "i hate this app", LocalDateTime.of(2024,11,2, 12,22), "Carter johns", 4, new GroceryItem())
    }
}
