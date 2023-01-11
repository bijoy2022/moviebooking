package com.yorbit.moviebooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
//@OpenAPIDefinition(info = @Info(title = "Movie Booking", version = "2.0", description = "Movie Booking"))
//@EnableSwagger2
@OpenAPIDefinition(info = @Info(title = "Employees API", version = "2.0", description = "Employees Information"))
public class MoviebookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviebookingApplication.class, args);
	}
	
	/*
	 * @Bean public Docket productApi() { return new
	 * Docket(DocumentationType.SWAGGER_2).select()
	 * .apis(RequestHandlerSelectors.basePackage(
	 * "com.yorbit.moviebooking.controller")).build(); }
	 */
	 
		/*
		 * @Bean public Docket productApi() { return new
		 * Docket(DocumentationType.SWAGGER_2) .select()
		 * .apis(RequestHandlerSelectors.basePackage(
		 * "com.yorbit.moviebooking.controller")) .paths(regex("/product.*")) .build();
		 * 
		 * }
		 */

}
