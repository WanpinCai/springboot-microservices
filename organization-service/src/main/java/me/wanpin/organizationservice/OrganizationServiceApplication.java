package me.wanpin.organizationservice;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
		info = @Info(
				title = "Organization Service REST APIs",
				description = "Organization Service REST APIs Documentations",
				version = "v1.0",
				contact = @Contact(
						name = "Wanpin",
						email = "wanpin77@gmail.com",
						url = "https://www.linkedin.com/in/wanpincai/"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.linkedin.com/in/wanpincai/"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Organization Service Doc",
				url = "wanpin.me/Organization_Service.html"
		)
)
@SpringBootApplication
//@EnableEurekaClient
public class OrganizationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrganizationServiceApplication.class, args);
	}

}
