package com.example;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.entity.User;
import com.example.repository.UserRepository;

@SpringBootApplication
public class VercelexploreApplication {

	public static void main(String[] args) {
		SpringApplication.run(VercelexploreApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UserRepository userRepository) {
		return args -> {
			Stream.of("pooja", "kamalika", "bipasa", "rittika", "amitava").forEach(name -> {
				User user = new User(name, name.toLowerCase() + "@vercel.com");
				userRepository.save(user);
			});
			userRepository.findAll().forEach(System.out::println);
		};
	}

}
