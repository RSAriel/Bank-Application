package com.example.bank;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Bank Application by arss5",
				description = "Backend Rest API for simple Bank Application",
				version = "v1.0",
				contact = @Contact(
						name = "Ariel Santos",
						email = "simple.bank.application@gmail.com",
						url = "https://github.com/RSAriel/Bank-Application"
				),
				license = @License(
						name = "arss5",
						url = "https://github.com/RSAriel/Bank-Application"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Bank Application Documentation by arss5",
				url = "https://github.com/RSAriel/Bank-Application"
		)
)
public class BankApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
	}

}
