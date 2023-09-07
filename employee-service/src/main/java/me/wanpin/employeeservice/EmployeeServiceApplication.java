package me.wanpin.employeeservice;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@OpenAPIDefinition(
		info = @Info(
				title = "Employee Service REST APIs",
				description = "Employee Service REST APIs Documentations",
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
				description = "Employee Service Doc",
				url = "wanpin.me/Employee_Service.html"
		)
)
@SpringBootApplication
@EnableFeignClients
//@EnableEurekaClient
public class EmployeeServiceApplication {

//	@Bean
//	public RestTemplate restTemplate(){
//		return new RestTemplate();
//	}

	@Bean
	public WebClient webClient(){
		return WebClient.builder().build();
	}

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

}
