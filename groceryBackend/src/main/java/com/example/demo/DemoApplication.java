package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
@CrossOrigin(origins = "http://localhost:5174") // Replace with your React app's URL
@SpringBootApplication
@RestController
@RequestMapping("/api")
public class DemoApplication {

	public static void main(String[] args) {SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/users")
	public List<Student> getUsers(){
		return List.of(new Student("Carter Johns" , "Cartermjohns@outlook.com", 1, LocalDate.of(2005,11,28) ));
	}

}
