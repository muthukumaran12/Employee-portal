package com.societegenerale.employeeportal.configuration;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	
	 @Bean
	    public Docket productApi() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .select()
	                .apis(RequestHandlerSelectors.basePackage("com.societegeneral.controller"))
	                .paths(regex("/api/v1/employees/*"))
	                .build()
	                .apiInfo(apiInformation());
	    }
	 
	 private ApiInfo apiInformation() {
		    return new ApiInfo(
		      "Employee Portal", 
		      "Some employee related APIs (Societe Generale Test)", 
		      "API TOS", 
		      "Terms of service", 
		      new Contact("muthukumaran12", "https://github.com/muthukumaran12", "muthukumaran012@gmail.com"), 
		      "None", "None", Collections.emptyList());
		}
}