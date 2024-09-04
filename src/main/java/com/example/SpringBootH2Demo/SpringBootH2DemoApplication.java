package com.example.SpringBootH2Demo;

import com.example.SpringBootH2Demo.model.Book;
import com.example.SpringBootH2Demo.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootH2DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootH2DemoApplication.class, args);
		Object dataSource = context.getBean("dataSource");
		System.out.println(dataSource);
	}

	@Bean
	CommandLineRunner commandLineRunner(BookRepository repository) {
		return args -> {
			repository.save(new Book(null, "Spring Boot: Up and Running", 328, "Mark Heckler"));
			repository.save(new Book(null, "Spring Boot: Up and Running 2", 329, "Mark Heckler 2"));
		};
	}
}
