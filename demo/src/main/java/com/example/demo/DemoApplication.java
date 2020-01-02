package com.example.demo.data.jpa.crud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.example.demo.data.jpa.crud.entity")
@EnableJpaRepositories("ccom.example.demo.data.jpa.crud.repository")
@SpringBootApplication(scanBasePackages = "com.example.demo.data.jpa.crud.")

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
